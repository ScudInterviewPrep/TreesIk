package trees1;

public class SingleValueTree {
  public int countUnivalSubtrees(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return countUnivalSubtreesBottomUp(root)[0];
  }
    
  // [0] = count, [1] = 0 for false and 1 for true
  public int[] countUnivalSubtreesBottomUp(TreeNode root) {
    if (root.left == null && root.right == null) {
      return new int[]{1, 1};
    }
    
    int[] result = new int[2];
    boolean isUniSub = true;
    if (root.left != null) {
      int[] left = countUnivalSubtreesBottomUp(root.left);
      result[0] += left[0];
      isUniSub = isUniSub && left[1] == 1 && root.left.val == root.val;
    }
    if (root.right != null) {
      int[] right = countUnivalSubtreesBottomUp(root.right);
      result[0] += right[0];
      isUniSub = isUniSub && right[1] == 1 && root.right.val == root.val;
    }
    if (isUniSub) {
      result[0]++;
      result[1] = 1;
    }
    return result;
  }
}

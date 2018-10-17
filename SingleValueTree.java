package trees1;

public class SingleValueTree {
  /*
 * Complete the function below.
 */
  static int findSingleValueTrees(Node n) {
    if (n == null) {
      return 0;
    }
    int r = findSingleValueTrees(n.val, n);
    return r == 0 ? 1 : r;
  }

  static int findSingleValueTrees(int parentVal, Node n) {
    if (n.left == null && n.right == null) {
      return (n.val == parentVal) ? 1 : 0;
    }
    int left = 0;
    if (n.left != null) {
      left = findSingleValueTrees(n.val, n.left);
    }
    int right = 0;
    if (n.right != null) {
      right = findSingleValueTrees(n.val, n.right);
    }
    int total = left + right;
    if (total > 0 && n.val == parentVal) {
      return 1 + total;
    }
    return 0;
  }

  public static void main(String[] args) {

  }
}

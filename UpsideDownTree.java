package trees1;

// all right nodes are leaf nodes
public class UpsideDownTree {
  public static Node flip(Node root) {
    if (root == null || root.left == null) {
      return null;
    }
    Node next = flip(root.left);
    root.left.right = root;
    root.left.left = root.right;
    if (next != null) {

    }
    return next == null ? root.left : next;
  }

  public static void main(String[] args) {
    Node r = UpsideDownTree.flip(MakeTestTree.makeTestRightLeafTree());
    while (r != null) {
      System.out.println(r.val);
      System.out.println(r.left != null ? r.left.val : null);
      r = r.right;
    }
  }
}

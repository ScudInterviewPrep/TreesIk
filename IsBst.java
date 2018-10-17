package trees1;

/* Better way is to use a range of left and right */
public class IsBst {
  private static Integer prev = null;

  public static boolean isBst(Node node) {
    if (node == null) {
      return true;
    }
    if (!isBst(node.left) || (prev != null && prev > node.val)) {
      return false;
    }
    prev = node.val;
    return isBst(node.right);
  }

  public static void main(String[] args) {
    System.out.println(IsBst.isBst(MakeTestTree.makeTestTree()));
  }
}

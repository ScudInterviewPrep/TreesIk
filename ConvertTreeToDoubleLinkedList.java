package trees1;

public class ConvertTreeToDoubleLinkedList {
  private static Node head = null;
  private static Node curr = null;


  // 2 passes, 1 pass to set right, then 2nd pass to set left
  private static void convert(Node root) {
    if (root == null) {
      return;
    }
    // go left
    // process self
    // go right
    convert(root.left);
    if (head == null) {
      head = root;
      curr = root;
    } else {
      curr.right = root;
      root.left = curr;
      curr = root;
    }
    convert(root.right);
  }

  public static void main(String[] args) {
    ConvertTreeToDoubleLinkedList.convert(MakeTestTree.makeTestTree());
    Node node = head;
    while (node.right != null) {
      System.out.print(node.val + ", ");
      node = node.right;
    }
    System.out.print(node.val + ", ");
    System.out.println();
    while (node != null) {
      System.out.print(node.val + ", ");
      node = node.left;
    }
  }
}

package trees1;

public class PrintAllTreePaths {
  public static void printAllTreePaths(Node root) {
    if (root == null) {
      return;
    }
    StringBuilder path = new StringBuilder();
    printPaths(path, root);
  }

  private static void printPaths(StringBuilder path, Node node) {
    if (node.left == null && node.right == null) {
      path.append(node.val);
      System.out.println(path);
      path.deleteCharAt(path.length() - 1);
      return;
    }
    path.append(node.val);
    printPaths(path, node.left);
    printPaths(path, node.right);
    path.deleteCharAt(path.length() - 1);
  }

  public static void main(String[] args) {
    Node test = MakeTestTree.makeTestTree();
    PrintAllTreePaths.printAllTreePaths(test);
  }
}

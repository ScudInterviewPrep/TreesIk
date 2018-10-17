package trees1;

import java.util.LinkedList;
import java.util.List;

public class PostOrderNoRecursion {
  public static void postOrderNoRecursion(Node root) {
    List<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node next = queue.remove(0);
      if (next == null) {
        continue;
      }
      queue.add(next.left);
      queue.add(next.right);
      System.out.print(next.val + ", ");
    }
  }

  public static void main(String[] args) {
    PostOrderNoRecursion.postOrderNoRecursion(MakeTestTree.makeTestTree());
  }
}

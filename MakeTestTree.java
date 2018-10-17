package trees1;

public class MakeTestTree {
  public static Node makeTestTree() {
    Node _1 = new Node(1);
    Node _2 = new Node(2);
    Node _3 = new Node(3);
    Node _4 = new Node(4);
    Node _5 = new Node(5);
    Node _6 = new Node(6);
    Node _7 = new Node(7);
    // 2 <- 4 -> 6
    _4.left = _2;
    _4.right = _6;
    // 1 <- 2 -> 3
    _2.left = _1;
    _2.right = _3;
    // 5 <- 6 -> 7
    _6.left = _5;
    _6.right = _7;
    /*
                  4   <- root
                /   \
               2     6
             /  \   /  \
            1   3  5    7
     */
    return _4;
  }

  public static Node makeTestRightLeafTree() {
    Node _1 = new Node(1);
    Node _2 = new Node(2);
    Node _3 = new Node(3);
    Node _4 = new Node(4);
    Node _5 = new Node(5);
    Node _6 = new Node(6);
    Node _7 = new Node(7);
    // 2 <- 4 -> 6
    _4.left = _2;
    _4.right = _6;
    // 1 <- 2 -> 3
    _2.left = _1;
    _2.right = _3;
    // 5 <- 6 -> 7
    _1.left = _5;
    _1.right = _7;
    /*
                  4   <- root
                /  \
               2    6
             /  \
            1    3
          /  \
         5    7
     */
    return _4;
  }
}

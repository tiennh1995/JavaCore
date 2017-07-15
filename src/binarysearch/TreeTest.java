package binarysearch;

public class TreeTest {
  public static void main(String[] args) {
    Tree tree = new Tree();
    int value;
    for (int i = 0; i < 10; i++) {
      value = i;
      tree.insertNode(value);
    }

    System.out.println("\n\nPreorder traversal");
    tree.preorderTraversal();
    System.out.println("\n\nInorder traversal");
    tree.inorderTraversal();
    System.out.println("\n\nPostorder traversal");
    tree.postorderTraversal();
  }
}

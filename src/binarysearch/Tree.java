package binarysearch;

public class Tree {
  private TreeNode root;

  public Tree() {
    root = null;
  }

  public void insertNode(int insertValue) {
    if (root == null)
      root = new TreeNode(insertValue);
    else
      root.insert(insertValue);
  }

  public void preorderTraversal() {
    preorder(root);
  }

  public void inorderTraversal() {
    inorder(root);
  }

  public void postorderTraversal() {
    postorder(root);
  }

  public void preorder(TreeNode node) {
    if (node == null)
      return;
    System.out.println(node.data + " ");
    preorder(node.leftNode);
    preorder(node.rightNode);
  }

  public void inorder(TreeNode node) {
    if (node == null)
      return;
    inorder(node.leftNode);
    System.out.println(node.data + " ");
    inorder(node.rightNode);
  }

  public void postorder(TreeNode node) {
    if (node == null)
      return;
    postorder(node.leftNode);
    postorder(node.rightNode);
    System.out.println(node.data + " ");
  }
}

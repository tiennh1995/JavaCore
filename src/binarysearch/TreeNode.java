package binarysearch;

public class TreeNode {
  int data;
  TreeNode leftNode, rightNode;

  public TreeNode(int nodeData) {
    data = nodeData;
    leftNode = rightNode = null;
  }

  public void insert(int value) {
    if (value < data) {
      if (leftNode == null)
        leftNode = new TreeNode(value);
      else
        leftNode.insert(value);
    } else {
      if (rightNode == null)
        rightNode = new TreeNode(value);
      else
        rightNode.insert(value);
    }
  }
}

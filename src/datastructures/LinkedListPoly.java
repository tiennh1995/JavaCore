package datastructures;

public class LinkedListPoly {
  private NodePoly first;
  private NodePoly last;

  public LinkedListPoly() {
    first = last = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void insertAtFront(int data1, int data2) {
    if (isEmpty())
      first = last = new NodePoly(data1, data2);
    else
      first = new NodePoly(data1, data2, first);
  }

  public void insertAtBack(int data1, int data2) {
    if (isEmpty())
      first = last = new NodePoly(data1, data2);
    else
      last = last.nextNode = new NodePoly(data1, data2);
  }

  public void insertFront(int data1, int data2, NodePoly node) {
    if (node == first)
      insertAtFront(data1, data2);
    else if (node == last)
      insertAtBack(data1, data2);
    else {
      NodePoly current = first;
      while (current.nextNode != node)
        current = current.nextNode;

      NodePoly nodePoly = new NodePoly(data1, data2);
      current.nextNode = nodePoly;
      nodePoly.nextNode = node;
    }
  }

  public int[] removeFromFront() {
    int[] removeItem = null;
    if (!isEmpty()) {
      removeItem = first.data;
      if (first == last)
        first = last = null;
      else
        first = first.nextNode;
    }
    return removeItem;
  }

  public int[] removeFromBack() {
    int[] removeItem = null;
    if (!isEmpty()) {
      removeItem = last.data;
      if (first == last)
        first = last = null;
      else {
        NodePoly current_node = first;
        while (current_node.nextNode != last)
          current_node = current_node.nextNode;
        last = current_node;
        last.nextNode = null;
      }
    }

    return removeItem;
  }

  public void print() {
    NodePoly temp = first;
    while (temp != null) {
      if (temp.nextNode != null)
        System.out.print(temp.data[0] + "x^" + temp.data[1] + " + ");
      else
        System.out.print(temp.data[0] + "x^" + temp.data[1]);

      temp = temp.nextNode;
    }

    System.out.println("");
  }

  public NodePoly getFirst() {
    return first;
  }

  public NodePoly getLast() {
    return last;
  }
}

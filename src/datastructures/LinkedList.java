package datastructures;

public class LinkedList {
  private Node first;
  private Node last;

  public LinkedList() {
    first = last = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void insertAtFront(int insertItem) {
    if (isEmpty())
      first = last = new Node(insertItem);
    else
      first = new Node(insertItem, first);
  }

  public void insertAtBack(int insertItem) {
    if (isEmpty())
      first = last = new Node(insertItem);
    else
      last = last.nextNode = new Node(insertItem);
  }

  public int removeFromFront() {
    int removeItem = Integer.MIN_VALUE;
    if (!isEmpty()) {
      removeItem = first.data;
      if (first == last)
        first = last = null;
      else
        first = first.nextNode;
    }
    return removeItem;
  }

  public int removeFromBack() {
    int removeItem = Integer.MIN_VALUE;
    if (!isEmpty()) {
      removeItem = last.data;
      if (first == last)
        first = last = null;
      else {
        Node current_node = first;
        while (current_node.nextNode != last)
          current_node = current_node.nextNode;
        last = current_node;
        last.nextNode = null;
      }
    }

    return removeItem;
  }

  public void print() {
    Node temp = first;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.nextNode;
    }

    System.out.println("");
  }

  // Sắp xếp danh sách theo thứ tự tăng dần.
  public void sortASC() {
    Node current1 = first;
    while (current1 != null) {
      Node current2 = current1.nextNode;
      while (current2 != null) {
        if (current2.data < current1.data) {
          int value = current1.data;
          current1.data = current2.data;
          current2.data = value;
        }
        current2 = current2.nextNode;
      }
      current1 = current1.nextNode;
    }
  }

  public Node getFirst() {
    return first;
  }

  public Node getLast() {
    return last;
  }

  // Chèn thêm phần từ vào ds liên kết (đã tăng dần), để được ds mới cũng tăng dần
  public void insertASC(int insertItem) {
    if (!isEmpty()) {
      if (first.data >= insertItem)
        this.insertAtFront(insertItem);
      else if (last.data <= insertItem)
        this.insertAtBack(insertItem);
      else {
        Node current_node = first;
        Node nextNode = current_node.nextNode;
        while (nextNode.data < insertItem) {
          current_node = nextNode;
          nextNode = nextNode.nextNode;
        }
        current_node.nextNode = new Node(insertItem, nextNode);
      }
    }
  }
}

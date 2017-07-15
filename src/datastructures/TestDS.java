package datastructures;

public class TestDS {
  public static void main(String[] args) {
    // LinkedList ll = new LinkedList();
    // ll.insertAtBack(1);
    // ll.insertAtBack(2);
    // ll.insertAtBack(4);
    // // Test bai 2
    // checkLinkedList(ll);
    //
    // // Test bai 3
    // countElement(ll);
    //
    // // Test bai 4
    // LinkedList ll2 = new LinkedList();
    // ll2.insertAtBack(3);
    // ll2.insertAtBack(5);
    // mergedLinkedList(ll, ll2);
    // ll.print();

    // Test bai 5
    LinkedListPoly llp1 = new LinkedListPoly();
    llp1.insertAtBack(5, 5);
    llp1.insertAtBack(2, 2);
    llp1.insertAtBack(1, 1);
    llp1.insertAtBack(1, 0);
    System.out.print("Da thuc 1: ");
    llp1.print();

    LinkedListPoly llp2 = new LinkedListPoly();
    llp2.insertAtBack(3, 6);
    llp2.insertAtBack(3, 3);
    llp2.insertAtBack(3, 2);
    System.out.print("Da thuc 2: ");
    llp2.print();

    LinkedListPoly llp3 = add2Polynomial(llp1, llp2);
    System.out.print("Tong 2 da thuc: ");
    llp3.print();
  }

  // Kiá»ƒm tra danh sÃ¡ch liÃªn káº¿t Ä‘Ã£ cho cÃ³ pháº£i danh sÃ¡ch tÄƒng dáº§n
  // theo giÃ¡ trá»‹
  // hay k
  public static void checkLinkedList(LinkedList ll) {
    Node current = ll.getFirst();
    while (current != null) {
      Node current_next = current.nextNode;
      if (current_next != null && current_next.data <= current.data) {
        System.out.println("Danh sach da cho khong phai danh sach tang dan");
        return;
      }
      current = current.nextNode;
    }

    System.out.println("Danh sach da cho la danh sach tang dan");
  }

  // Ä�áº¿m sá»‘ láº§n xuáº¥t hiá»‡n cá»§a tá»«ng pháº§n tá»­
  public static void countElement(LinkedList ll) {
    Node node = ll.getFirst();
    int[] result1 = new int[100];
    int[] result2 = new int[100];
    int resultLength = 0;
    int value;
    while (node != null) {
      value = node.data;
      int index = checkExist(result1, value);
      if (index == -1) {
        result1[resultLength] = value;
        result2[resultLength] = 1;
        resultLength++;
      } else {
        result2[index] += 1;
      }
      node = node.nextNode;
    }

    for (int i = 0; i < resultLength; i++)
      System.out.println("Phan tu " + result1[i] + " xuat hien: " + result2[i] + " lan");
  }

  public static int checkExist(int[] array, int element) {
    for (int i = 0; i < array.length; i++)
      if (array[i] == element)
        return i;

    return -1;
  }

  // Viáº¿t chÆ°Æ¡ng trÃ¬nh trá»™n 2 danh sÃ¡ch liÃªn káº¿t, chá»©a cÃ¡c sá»‘
  // nguyÃªn theo thá»© tá»±
  // tÄƒng dáº§n, Ä‘á»ƒ Ä‘Æ°á»£c danh sÃ¡ch liÃªn káº¿t cÅ©ng tÄƒng dáº§n.
  public static void mergedLinkedList(LinkedList ll1, LinkedList ll2) {
    Node node = ll2.getFirst();
    while (node != null) {
      int value = ll2.removeFromFront();
      ll1.insertASC(value);
      node = ll2.getFirst();
    }
  }

  // Viáº¿t chÆ°Æ¡ng trÃ¬nh cá»™ng hai Ä‘a thá»©c
  public static LinkedListPoly add2Polynomial(LinkedListPoly llp1, LinkedListPoly llp2) {
    // int[] remove1 = ll1.removeFromFront();
    // int[] remove2 = ll2.removeFromFront();
    NodePoly node1 = llp1.getFirst();
    NodePoly node2 = llp2.getFirst();
    LinkedListPoly ll3 = new LinkedListPoly();

    while (node1 != null && node2 != null) {
      while (node1 != null && node1.data[1] > node2.data[1]) {
        ll3.insertAtBack(node1.data[0], node1.data[1]);
        node1 = node1.nextNode;
      }

      while (node2 != null && node2.data[1] > node1.data[1]) {
        ll3.insertAtBack(node2.data[0], node2.data[1]);
        node2 = node2.nextNode;
      }

      while (node1 != null && node2 != null && node1.data[1] == node2.data[1]) {
        ll3.insertAtBack(node1.data[0] + node2.data[0], node2.data[1]);
        node1 = node1.nextNode;
        node2 = node2.nextNode;
      }
    }

    while (node1 != null) {
      ll3.insertAtBack(node1.data[0], node1.data[1]);
      node1 = node1.nextNode;
    }
    while (node2 != null) {
      ll3.insertAtBack(node2.data[0], node2.data[1]);
      node2 = node2.nextNode;
    }

    return ll3;
  }

  public static LinkedListPoly add2Polynomial2(LinkedListPoly llp1, LinkedListPoly llp2) {
    NodePoly node1 = llp1.getFirst();
    NodePoly node2 = llp2.getFirst();
    NodePoly before = null;

    while (node1 != null && node2 != null) {
      while (node1 != null && node1.data[1] > node2.data[1]) {
        before = node1;
        node1 = node1.nextNode;
      }

      while (node2 != null && node2.data[1] > node1.data[1]) {
        before.nextNode = node2;
        before = before.nextNode;
        before.nextNode = node1;
        node2 = node2.nextNode;
      }

      while (node1 != null && node2 != null && node1.data[1] == node2.data[1]) {
        node1.data[0] += node2.data[0];
        node1 = node1.nextNode;
        node2 = node2.nextNode;
      }
    }

    if (node2 != null) {
      before.nextNode = node2;
    }

    return llp1;
  }
}

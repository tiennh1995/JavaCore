package datastructures;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertAtBack(1);
		ll.insertAtBack(2);
		ll.insertAtBack(4);
		ll.insertASC(3);
//		ll.sortASC();
		ll.print();
		// System.out.println(ll.removeFromBack());
		// System.out.println(ll.removeFromFront());
	}
}

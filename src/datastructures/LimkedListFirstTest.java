package datastructures;

public class LimkedListFirstTest {
	public static void main(String[] args) {
		LinkedListFirst llf = new LinkedListFirst();
		llf.insertAtFront(1);
		llf.insertAtFront(2);
		llf.insertAtFront(3);
		llf.print();
		System.out.println(llf.removeFromBack());
		System.out.println(llf.removeFromFront());
	}
}

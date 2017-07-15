package datastructures;

public class Node {
	int data;
	Node nextNode;

	public Node(int value) {
		this(value, null);
	}

	public Node(int value, Node next) {
		this.data = value;
		this.nextNode = next;
	}
}

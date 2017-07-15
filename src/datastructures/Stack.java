package datastructures;

public class Stack {
	private LinkedList stack;

	public Stack() {
		stack = new LinkedList();
	}

	public void push(int insertItem) {
		stack.insertAtFront(insertItem);
	}

	public int pop() {
		return stack.removeFromFront();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public void print() {
		stack.print();
	}
}

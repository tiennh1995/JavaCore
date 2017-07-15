package datastructures;

public class Queue {
	private LinkedList queue;

	public Queue() {
		queue = new LinkedList();
	}

	public void enqueue(int insertItem) {
		queue.insertAtBack(insertItem);
	}

	public int dequeue() {
		return queue.removeFromFront();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public void print() {
		queue.print();
	}
}

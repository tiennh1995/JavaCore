package datastructures;

public class LinkedListFirst {
	private Node first;

	public LinkedListFirst() {
		first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertAtFront(int insertItem) {
		if (isEmpty())
			first = new Node(insertItem);
		else
			first = new Node(insertItem, first);
	}

	public void insertAtBack(int insertItem) {
		if (isEmpty())
			first = new Node(insertItem);
		else {
			Node last = first;
			while (last.nextNode != null) {
				last = last.nextNode;
			}

			last.nextNode = new Node(insertItem);
		}
	}

	public int removeFromFront() {
		int removeItem = Integer.MIN_VALUE;
		if (!isEmpty()) {
			removeItem = first.data;
			first = first.nextNode;
		}

		return removeItem;
	}

	public int removeFromBack() {
		int removeItem = Integer.MIN_VALUE;
		if (!isEmpty()) {
			Node last1 = first;
			Node last2 = last1.nextNode;
			while (last2 != null && last2.nextNode != null) {
				last1 = last2;
				last2 = last2.nextNode;
			}

			if (last2 == null) {
				removeItem = last1.data;
				last1 = null;
			} else {
				removeItem = last2.data;
				last1.nextNode = null;
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
}

package datastructures;

// Nguyen Huu Tien
// Cài đặt hàng đợi bằng mảng xoay vòng

public class QueueWithArray {
	public static final int MAX_LENGTH = 50;
	int[] array;
	int first;
	int last;

	public QueueWithArray() {
		array = new int[MAX_LENGTH];
		first = -1;
		last = -1;
	}

	public boolean isEmpty() {
		return first == -1;
	}

	public boolean isFull() {
		return (last + 1) % MAX_LENGTH == first;
	}

	public void enqueue(int insertItem) {
		if (!isFull()) {
			last = (last + 1) % MAX_LENGTH;
			array[last] = insertItem;
			if (isEmpty())
				first = last;
		}
	}

	public int dequeue() {
		int removeItem = Integer.MIN_VALUE;
		if (!isEmpty()) {
			removeItem = array[first];
			if (first == last)
				first = -1;
			else
				first = (first + 1) % MAX_LENGTH;
		}
		return removeItem;
	}

	public void print() {
		if (!isEmpty()) {
			for (int i = first; i != last + 1; i++)
				System.out.println(array[i % MAX_LENGTH]);
			System.out.println("");
		}
	}
}

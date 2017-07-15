package datastructures;

public class QueueWithArrayTest {
	public static void main(String[] args) {
		QueueWithArray qwa = new QueueWithArray();
		qwa.enqueue(1);
		qwa.enqueue(2);
		qwa.enqueue(3);
		
		qwa.dequeue();
		qwa.dequeue();
		qwa.dequeue();
		
		qwa.print();
	}
}

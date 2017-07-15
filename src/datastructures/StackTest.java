package datastructures;

public class StackTest {
	public static void main(String[] args) {
		change10To2(9);
	}

	public static void change10To2(int decimaNum) {
		Stack stack = new Stack();

		do {
			stack.push(decimaNum % 2);
			decimaNum = decimaNum / 2;
		} while (decimaNum != 0);

		stack.print();
	}
}

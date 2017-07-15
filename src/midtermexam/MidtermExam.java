package midtermexam;

import java.util.StringTokenizer;

public class MidtermExam {
	public static void main(String[] args) {
		int[][] array = { { 1, 5, 8, 0 }, { 4, 6, 1, 8 }, { 2, 9, 7, 1 }, { 9, 3, 2, 6 } };

		// Bai 1
		System.out.println("Bai 1 -------------------------------");
		maxtrix(array);

		// Bai2
		System.out.println("\nBai 2 --------------------------------");
		useStringTokenizer("Nguyen Huu Tien    ");
	}

	// Bai 1
	public static void maxtrix(int[][] array) {

		// 1.1
		int max = array[0][0], maxIndexesLength = 1;
		int[] maxIIndexes = new int[array.length];
		int[] maxJIndexes = new int[array[0].length];
		maxIIndexes[0] = 0;
		maxJIndexes[0] = 0;
		int i, j;
		System.out.println("Phan tu lon trong cua ma tran cung chi so voi no tuong ung la: ");
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
					maxIndexesLength = 1;
					maxIIndexes[0] = i;
					maxJIndexes[0] = j;
				} else if (max == array[i][j]) {
					maxIIndexes[maxIndexesLength] = i;
					maxJIndexes[maxIndexesLength] = j;
					maxIndexesLength++;
				}
			}
		}
		for (i = 0; i < maxIndexesLength; i++)
			System.out.println("[" + maxIIndexes[i] + "][" + maxJIndexes[i] + "] : " + max);

		// 1.2
		System.out.println("\nDach sach cac phan tu la so nguyen to trong ma tran: ");
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				if (checkPrimeNumber(array[i][j]))
					System.out.println("[" + i + "][" + j + "] : " + array[i][j]);
			}
		}

		// 1.3
		System.out.println("\nMa tran truoc khi sap xep: ");
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("Ma tran sau khi sap xep: ");
		int2Sort(array);

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static boolean checkPrimeNumber(int x) {
		if (x == 0)
			return false;

		for (int i = 2; i <= Math.sqrt(x); i++)
			if (x % i == 0)
				return false;
		return true;
	}

	public static void int2Sort(int[][] array) {
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				for (int k = j + 1; k < 4; k++)
					if (array[j][i] > array[k][i]) {
						int temp = array[j][i];
						array[j][i] = array[k][i];
						array[k][i] = temp;
					}
	}

	// Bai 2
	public static void useStringTokenizer(String fullName) {
		fullName = fullName.replaceAll(" +", " ");
		fullName = fullName.trim();
		System.out.println("Ten truoc khi dao nguoc: " + fullName);

		StringTokenizer st = new StringTokenizer(fullName);
		StringBuffer newFullName = new StringBuffer("");
		StringBuffer name = new StringBuffer("");

		while (st.hasMoreTokens()) {
			name.append(st.nextToken() + " ");
			if (st.hasMoreTokens()) {
				newFullName.append(name);
			} else {
				newFullName.insert(0, name);
			}
			name.delete(0, name.length());
		}

		System.out.println("Ten sau khi dao nguoc: " + newFullName);
	}
}

package lecture4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sort {
	private static FileOutputStream fos;
	private static FileInputStream fis;
	private static BufferedReader br;
	private static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		// int[] array = { 10, 7, 3, 6, 1, 0, 5, 2 };

		// System.out.println("Mang truoc khi sap xep: ");
		// for (int i = 0; i < array.length; i++)
		// System.out.print(array[i] + " ");
		//
		// insertionSort(array);
		//
		// System.out.println("\nMang sau khi sap xep: ");
		// for (int i = 0; i < array.length; i++)
		// System.out.print(array[i] + " ");

		// bubbleSortS1(array);
		// for (int i = 0; i < array.length; i++)
		// System.out.print(array[i] + " ");
		//
		// System.out.println("");
		//
		// bubbleSortS2(array);
		// for (int i = 0; i < array.length; i++)
		// System.out.print(array[i] + " ");

		// bubbleSort(array);
		// for (int i = 0; i < array.length; i++)
		// System.out.print(array[i] + " ");

		// int[][] arrayM = { { 1, 5, 8, 0 }, { 2, 6, 1, 8 }, { 6, 9, 7, 1 }, { 9,
		// 3, 2, 6 } };
		// fos = new FileOutputStream("dataSort.txt");
		// fos.write(4);
		// fos.write(4);
		// for (int i = 0; i < arrayM.length; i++)
		// for (int j = 0; j < arrayM[0].length; j++)
		// fos.write(arrayM[i][j]);
		// fos.close();
		//
		// bubbleSortByteFile("dataSort.txt", "resultSort.txt");
		bubbleSortStringFile("dataString.txt", "resultString.txt");

		// bubbleSortMatrix(arrayM);
		// for (int i = 0; i < arrayM.length; i++) {
		// for (int j = 0; j < arrayM[0].length; j++) {
		// System.out.print(arrayM[i][j] + " ");
		// }
		// System.out.println("");
		// }
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[minIndex] > array[j])
					minIndex = j;

			if (i != minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			while (i > 0 && temp < array[i - 1]) {
				array[i] = array[i - 1];
				i--;
			}
			array[i] = temp;
		}
	}

	// 10, 7, 3, 6, 1, 0, 5, 2
	public static void bubbleSortS1(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] < array[i - 1]) {
				int temp = array[i - 1];
				array[i - 1] = array[i];
				array[i] = temp;
			}
		}
	}

	public static void bubbleSortS2(int[] array) {
		for (int i = array.length - 1; i > 1; i--) {
			if (array[i] < array[i - 1]) {
				int temp = array[i - 1];
				array[i - 1] = array[i];
				array[i] = temp;
			}
		}
	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

	public static void bubbleSortMatrix(int[][] array) {
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array.length; j++) {
				for (int k = array.length - 1; k > j; k--) {
					if (array[k][i] < array[k - 1][i]) {
						int temp = array[k][i];
						array[k][i] = array[k - 1][i];
						array[k - 1][i] = temp;
					}
				}
			}
	}

	public static void bubbleSortByteFile(String dataFile, String resultFile) {
		int[][] arraySort = null;
		try {
			fis = new FileInputStream(dataFile);
			int n = fis.read();
			int m = fis.read();
			arraySort = new int[n][m];
			for (int i = 0; i < arraySort.length; i++)
				for (int j = 0; j < arraySort[0].length; j++)
					arraySort[i][j] = fis.read();

			System.out.println("Du lieu ma tran ban dau: ");
			for (int i = 0; i < arraySort.length; i++) {
				for (int j = 0; j < arraySort[0].length; j++) {
					System.out.print(arraySort[i][j] + " ");
				}
				System.out.println("");
			}
			fis.close();

			bubbleSortMatrix(arraySort);

			fos = new FileOutputStream(resultFile);
			fos.write(n);
			fos.write(m);
			for (int i = 0; i < arraySort.length; i++)
				for (int j = 0; j < arraySort[0].length; j++)
					fos.write(arraySort[i][j]);
			fos.close();

			System.out.println("Du lieu ma tran sau khi sap xep: ");
			for (int i = 0; i < arraySort.length; i++) {
				for (int j = 0; j < arraySort[0].length; j++) {
					System.out.print(arraySort[i][j] + " ");
				}
				System.out.println("");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void bubbleSortStringFile(String dataStringFile, String resultStringFile) {
		FileReader fr;
		FileWriter fw;
		try {
			fr = new FileReader(dataStringFile);
			br = new BufferedReader(fr);
			String str = br.readLine();
			String[] result = str.split(" ");
			int n = Integer.valueOf(result[0]);
			int m = Integer.valueOf(result[1]);
			int[][] arraySort = new int[n][m];
			int row = 0;
			while ((str = br.readLine()) != null) {
				result = str.split(" ");
				System.out.println(str);
				for (int i = 0; i < result.length; i++)
					arraySort[row][i] = Integer.parseInt(result[i]);
				row++;
			}
			fr.close();

			bubbleSortMatrix(arraySort);

			fw = new FileWriter(resultStringFile);
			bw = new BufferedWriter(fw);
			bw.write(n + " " + m + "\n");
			for (int i = 0; i < arraySort.length; i++) {
				str = "";
				for (int j = 0; j < arraySort[0].length; j++) {
					str += arraySort[i][j] + " ";
				}
				bw.write(str + "\n");
			}
			fw.close();
			System.out.println("Du lieu ma tran sau khi sap xep: ");
			for (int i = 0; i < arraySort.length; i++) {
				for (int j = 0; j < arraySort[0].length; j++) {
					System.out.print(arraySort[i][j] + " ");
				}
				System.out.println("");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

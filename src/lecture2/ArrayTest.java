package lecture2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest {
  public static void main(String[] args) {
    // ArrayTest at = new ArrayTest();
    // at.testArray();
    // at.testCopyArray();
    int[] array = { 1, 2 };
    ArrayTest.swap(array[0], array[1]);
    System.out.println(array[0]);
    System.out.println(array[1]);
    ArrayTest.swapFirstTwoInArray(array);
    System.out.println(array[0]);
    System.out.println(array[1]);
  }

  // Kiem tra day so tang
  public void testArray() {
    int num = 6, i;
    int[] array = new int[num];
    boolean check = true;
    BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
    String number;

    try {
      for (i = 0; i < num; i++) {
        System.out.println("Nhap so thu " + (i + 1) + ": ");
        number = inStream.readLine();
        array[i] = Integer.parseInt(number);
      }

      for (i = 0; i < num - 1; i++) {
        if (array[i + 1] <= array[i]) {
          check = false;
          break;
        }
      }

      if (check) {
        System.out.println("Day nhap vao la day so tang");
      } else {
        System.out.println("Day nhap vao la day KHONG tang");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // Test copyArray
  public void testCopyArray() {
    int[] list1 = { 0, 1, 2, 3, 4, 5 };
    System.out.println("Day list1 truoc khi list2 thay doi");
    for (int i = 0; i < list1.length; i++) {
      System.out.print(list1[i] + " ");
    }
    System.out.println("");

    int[] list2 = new int[list1.length];
    list2 = list1;

    list2[0] = 10;
    System.out.println("Day list1 sau khi list2 thay doi");
    for (int i = 0; i < list1.length; i++) {
      System.out.print(list1[i] + " ");
    }
  }

  // Test PassArray
  public static void swap(int n1, int n2) {
    int temp = n1;
    n1 = n2;
    n2 = temp;
  }

  public static void swapFirstTwoInArray(int[] array) {
    int temp = array[0];
    array[0] = array[1];
    array[1] = temp;
  }
}

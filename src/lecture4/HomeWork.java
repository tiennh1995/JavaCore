package lecture4;

import java.util.Arrays;

//Nguyen Huu Tien

public class HomeWork {
  public static void main(String[] args) {
    int[] array = { 10, 7, 3, 6, 1, 0, 7, 5, 2 };
    System.out.println("Day ban dau la: ");
    for (int i = 0; i < array.length; i++)
      System.out.print(array[i] + " ");
    System.out.println("\nGia lon thu 2 trong day la: " + getMax2(array));
    
    int[] array2 = { 1, 3, 5, 7 };
    System.out.println("Mang ban dau la: ");
    for (int i = 0; i < array2.length; i++)
      System.out.print(array2[i] + " ");

    int x = 4;
    array2 = insertValue(x, array2);
    System.out.println("\nMang sau khi chen phan tu " + x + " la: ");
    for (int i = 0; i < array2.length; i++)
      System.out.print(array2[i] + " ");

    int[] array3 = { 6, 8, 2 };
    System.out.println("\nMang truoc khi chen la: ");
    for (int i = 0; i < array2.length; i++)
      System.out.print(array2[i] + " ");

    array2 = insertArray(array3, array2);

    StringBuffer sb = new StringBuffer("\nMang sau khi chen [");
    for (int i = 0; i < array3.length; i++)
      if (i != array3.length - 1)
        sb.append(array3[i] + ", ");
      else
        sb.append(array3[i] + "] ");
    sb.append("la: ");
    System.out.println(sb);
    for (int i = 0; i < array2.length; i++)
      System.out.print(array2[i] + " ");

    int[] array4 = { -4, -2, 1, 0, -5, -4, -3, 0, 4, 1, 0, 1, 2, 3, 4 };
    getMaxSubArray(array4);
  }

  // 1. Tìm giá trị lớn thứ 2 trong dãy
  public static int getMax2(int[] array) {
    Sort.insertionSort(array);
    int i = array.length - 2;
    while (i > 0 && array[i] == array[array.length - 1]) {
      i--;
    }
    return array[i];
  }

  // 2. Cho day A tang dan, hay chen gia tri x vao A de dam bao A van tang dan.
  public static int[] insertValue(int x, int[] array) {
    array = Arrays.copyOf(array, array.length + 1);
    array[array.length - 1] = x;
    int i = array.length - 1;
    while (i > 0 && x < array[i - 1]) {
      array[i] = array[i - 1];
      i--;
    }
    array[i] = x;
    return array;
  }

  // 3. Cho day A tang dan, hay chen cac so trong day B vao day A-tang dan.
  public static int[] insertArray(int[] array1, int[] array2) {
    for (int i = 0; i < array1.length; i++)
      array2 = insertValue(array1[i], array2);
    return array2;
  }

  // 4. Cho day A, tim ra doan dai nhat gom cac phan tu liên tiếp co gia tri tang
  // dan:
  // Ví dụ: -4 -2 1 0 -5 -4 -3 0 4 1
  // Ta có các đoạn con tăng dần liên tiếp là: {-4 -2 1}; {0}; {-5 -4 -3 0 4} {1}
  // Trong đó đoạn con có độ dài lớn nhất là {-5 -4 -3 0 4} gồm 5 phần tử.

  public static void getMaxSubArray(int[] array) {
    int[] result = new int[array.length];
    int resultLength = 0, max = 1;
    for (int i = 0; i < array.length; i++) {
      int count = 1;
      while (i < (array.length - 1) && array[i + 1] > array[i]) {
        i++;
        count++;
      }
      if (count > max) {
        max = count;
        result[0] = i - count + 1;
        resultLength = 1;
      } else if (count == max) {
        result[resultLength++] = i - count + 1;
      }
    }
    System.out.println("\nDoan con co do dai lon nhat voi max: " + max);
    for (int i = 0; i < resultLength; i++) {
      for (int j = result[i]; j < max + result[i]; j++)
        System.out.print(array[j] + " ");
      System.out.println("");
    }
  }
}

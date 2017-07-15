package binarysearch;

/**
 * @author Nguyen Huu Tien
 */
public class BSArray {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6 };
     System.out.println(bsArray(7, array));
     System.out.println(bsArrayR(0, array.length - 1, 8, array));
    System.out.println(cal(0));
  }

  public static int bsArray(int x, int[] array) {
    int left = 0, right = array.length - 1, middle = (left + right / 2);
    while (left <= right) {
      if (x == array[middle])
        return middle;
      else if (x > array[middle])
        left = middle + 1;
      else
        right = middle - 1;
      middle = (left + right) / 2;
    }
    return -1;
  }

  public static int bsArrayR(int left, int right, int x, int[] array) {
    int middle = (left + right) / 2;
    if (left > right)
      return -1;
    if (x == array[middle])
      return middle;
    else if (x > array[middle])
      left = middle + 1;
    else
      right = middle - 1;
    return bsArrayR(left, right, x, array);
  }

  public static int cal(int n) {
    if (n == 0 || n == 1)
      return 1;
    return n * cal(n - 1);
  }
}

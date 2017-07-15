package lecture2;
/*
 * Nguyen Huu Tien
 */
public class MinIndex {
  public static void main(String[] args) {
    int[] array = { 10, 3, 1, 3, 5, 10, 5, 1 };
//    MinIndex.getMinIndexes(array);
    MinIndex.getMinWithStringBuffer(array);
  }
  
  // Tim danh sach chi so cua phan tu nho nhat trong mang, su dung array
  public static void getMinIndexes(int[] array) {
    int min = array[0], minIndexesLength = 1;
    int[] minIndexes = new int[array.length];
    minIndexes[0] = 0;

    for (int i = 1; i < array.length; i++) {
      if (array[i] <= min) {
        if (array[i] == min) {
          minIndexes[minIndexesLength++] = i;
        } else {
          min = array[i];
          minIndexesLength = 1;
          minIndexes[0] = i;
        }
      }
    }

    System.out.println("Gia tri min la: " + min + ". Tai cac vi tri: ");
    for (int i = 0; i < minIndexesLength; i++) {
      System.out.print(minIndexes[i] + " ");
    }
  }
  
  // Tim danh sach chi so cua cac phan tu nho nhat trong mang, su dung stringbuffer
  public static void getMinWithStringBuffer(int[] array ) {
    int min = array[0];
    StringBuffer sb = new StringBuffer();

    for (int i = 1; i < array.length; i++) {
      if (array[i] <= min) {
        if (array[i] < min) {
          min = array[i];
          sb.delete(0, sb.length());
        }
        sb.append(i);
        sb.append(' ');
      }
    }

    System.out.println("Gia tri min la: " + min + ". Tai cac vi tri: ");
    System.out.print(sb);
  }
}

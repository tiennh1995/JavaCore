package lecture1;

public class MultipleChoiceTest {
  public static void main(String[] args) {
    int svNum = 8, qNum = 10, i, j;
    char[][] data = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
        { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' }, { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
        { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' }, { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
        { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }, { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
        { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
    char[] testResult = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
    int[] result = { 0, 0, 0, 0, 0, 0, 0, 0 };

    for (i = 0; i < svNum; i++) {
      for (j = 0; j < qNum; j++) {
        if (data[i][j] == testResult[j])
          result[i]++;
      }
    }

    for (i = 0; i < svNum; i++) {
      System.out.println("Sinh vien thu " + (i + 1) + " : " + result[i]);
    }
  }
}

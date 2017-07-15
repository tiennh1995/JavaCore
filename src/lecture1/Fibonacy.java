package lecture1;

import java.io.*;

public class Fibonacy {
  int n1 = 0, n2 = 1, n3;

  public static void main(String[] args) {
    Fibonacy f = new Fibonacy();
    BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
    String number;

    try {
      System.out.println("Hay nhap do dai day so fibonacy: ");
      number = inStream.readLine();
      int n = Integer.parseInt(number);
      f.fibonacy(n);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void fibonacy(int n) {
    if (n > 0) {
      n3 = n1 + n2;
      System.out.println(n3);
      n1 = n2;
      n2 = n3;
      fibonacy(n - 1);
    }
  }
}

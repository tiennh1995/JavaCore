package lecture1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exc3 {
  public static void main(String[] args) {
    int x, i;
    boolean check = true;
    BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
    String number;
    try {
      System.out.println("Nhap so can kiem tra: ");
      number = inStream.readLine();
      x = Integer.parseInt(number);

      for (i = 2; i <= Math.sqrt(x); i++) {
        if (x % i == 0) {
          check = false;
          break;
        }
      }

      if (check) {
        System.out.println("So " + x + " la so nguyen to!\n");
      } else {
        System.out.println("So " + x + " khong la so nguyen to!\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

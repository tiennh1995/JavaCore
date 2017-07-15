package lecture1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exc1 {
  public static void main(String[] args) {
    int x, y, z, max;
    BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
    String number;
    try {
      System.out.println("Nhap so thu nhat: ");
      number = inStream.readLine();
      x = Integer.parseInt(number);

      System.out.println("Nhap so thu hai: ");
      number = inStream.readLine();
      y = Integer.parseInt(number);

      System.out.println("Nhap so thu ba: ");
      number = inStream.readLine();
      z = Integer.parseInt(number);

      max = x;

      if (y > max)
        max = y;

      if (z > max)
        max = z;

      System.out.println("So lon nhat trong 3 so " + x + ", " + y + ", " + z + " la: " + max);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

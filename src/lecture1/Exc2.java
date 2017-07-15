package lecture1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exc2 {
  public static void main(String[] args) {
    float a, b, c;

    BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
    String number;
    try {
      System.out.println("Nhap he so thu nhat: ");
      number = inStream.readLine();
      a = Float.parseFloat(number);

      if (a == 0) {
        System.out.println("Day khong phai he phuong trinh bac 2\n");
        System.exit(0);
      }

      System.out.println("Nhap he so thu hai: ");
      number = inStream.readLine();
      b = Integer.parseInt(number);

      System.out.println("Nhap he so thu ba: ");
      number = inStream.readLine();
      c = Integer.parseInt(number);

      float denta = b * b - 4 * a * c, x1, x2;
      if (denta < 0) {
        System.out.println("Phuong trinh vo nghiem\n");
      } else if (denta == 0) {
        x1 = (float) ((-b + Math.sqrt(denta)) / (2 * a));
        System.out.println("Nghiem cua he phuong trinh la: " + x1);
      } else {
        x1 = (float) ((-b + Math.sqrt(denta)) / (2 * a));
        x2 = (float) ((-b - Math.sqrt(denta)) / (2 * a));
        System.out.println("Nghiem 1 cua he phuong trinh la: " + x1);
        System.out.println("Nghiem 2 cua he phuong trinh la: " + x2);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

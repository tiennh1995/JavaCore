package oop;

public class KiemTraDiem {
  public static void main(String[] args) {
    Diem diem1 = new Diem(1, 2);
    Diem diem2 = new Diem(3, 3);
    System.out.println(diem1.getDistance(diem2));
    System.out.println(diem1.getDistance(diem2.getX(), diem2.getY()));
  }
}

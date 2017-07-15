package oop;

public class KiemTraTamGiac {
  public static void main(String[] args) {
    Diem diem1 = new Diem(3, 3);
    Diem diem2 = new Diem(5, 6);
    Diem diem3 = new Diem(7, 7);

    System.out.println(TamGiac.laTamGiac(diem1, diem2, diem3));
    TamGiac tg = new TamGiac(diem1, diem2, diem3);
    System.out.println(tg.toString());
  }
}

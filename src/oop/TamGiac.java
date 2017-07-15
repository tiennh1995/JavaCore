package oop;

public class TamGiac {
  private Diem diem1;
  private Diem diem2;
  private Diem diem3;

  public TamGiac(int x1, int y1, int x2, int y2, int x3, int y3) {
    this.diem1 = new Diem(x1, y1);
    this.diem2 = new Diem(x2, y2);
    this.diem3 = new Diem(x3, y3);
  }

  public TamGiac(Diem diem1, Diem diem2, Diem diem3) {
    this.diem1 = diem1;
    this.diem2 = diem2;
    this.diem3 = diem3;
  }

  public static boolean laTamGiac(Diem diem1, Diem diem2, Diem diem3) {
    float distanceX1 = diem1.getX() - diem2.getX();
    float distanceY1 = diem1.getY() - diem2.getY();
    float distanceX2 = diem2.getX() - diem3.getX();
    float distanceY2 = diem2.getY() - diem3.getY();

    return !((float) distanceX1 / distanceX2 == (float) distanceY1 / distanceY2);
  }

  public float calArea() {
    float edge1 = diem1.getDistance(diem2);
    float edge2 = diem2.getDistance(diem3);
    float edge3 = diem3.getDistance(diem1);
    float p = (edge1 + edge2 + edge3) / 2;
    return (float) Math.sqrt(p * (p - edge1) * (p - edge2) * (p - edge3));
  }

  public String toString() {
    return "Diem 1: (" + diem1.getX() + ", " + diem1.getY() + "). " + "Diem 2: (" + diem2.getX() + ", " + diem2.getY()
        + "). " + "Diem 3: (" + diem3.getX() + ", " + diem3.getY() + ")";
  }
}

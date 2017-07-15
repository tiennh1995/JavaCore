package oop;

public class Diem {
  private int x;
  private int y;

  public Diem() {
    this(0, 0);
  }

  public Diem(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setXY(int x, int y) {
    this.setX(x);
    this.setY(y);
  }

  public float getDistance(int x, int y) {
    return (float) Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
  }

  public float getDistance(Diem diem) {
    float x = diem.getX();
    float y = diem.getY();
    return (float) Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
  }

  public String toString() {
    return "Hoanh do: " + this.x + ". Tung do: " + this.y;
  }
}

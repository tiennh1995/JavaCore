package oop;

public class DiemDiChuyen implements GiaoDienDiChuyen {
  int x;
  int y;
  double vx;
  double vy;

  public DiemDiChuyen(int x, int y, double vx, double vy) {
    this.x = x;
    this.y = y;
    this.vx = vx;
    this.vy = vy;
  }

  public String toString() {
    return "Hoanh do: " + x + "\nTung do: " + y + "\nVan toc theo Ox: " + vx + "\nVan toc theo Oy: " + vy;
  }

  @Override
  public void diLen(double thoiGian) {
    y += thoiGian * vy;
    vx = 0;
    vy = 0;
  }

  @Override
  public void diXuong(double thoiGian) {
    y -= thoiGian * vy;
    vx = 0;
    vy = 0;
  }

  @Override
  public void sangTrai(double thoiGian) {
    x -= thoiGian * vx;
    vx = 0;
    vy = 0;
  }

  @Override
  public void sangPhai(double thoiGian) {
    x += thoiGian * vx;
    vx = 0;
    vy = 0;
  }
}

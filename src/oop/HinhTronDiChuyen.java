package oop;

public class HinhTronDiChuyen implements GiaoDienDiChuyen {
  double r;
  DiemDiChuyen tam;

  public HinhTronDiChuyen(double r, DiemDiChuyen tam) {
    this.r = r;
    this.tam = tam;
  }

  public String toString() {
    return "Ban kinh: " + r + "\nTam: (" + tam.x + ", " + tam.y + ")";
  }

  @Override
  public void diLen(double thoiGian) {
    tam.y += thoiGian * tam.y;
    tam.vx = 0;
    tam.vy = 0;
  }

  @Override
  public void diXuong(double thoiGian) {
    tam.y -= thoiGian * tam.y;
    tam.vx = 0;
    tam.vy = 0;
  }

  @Override
  public void sangTrai(double thoiGian) {
    tam.x -= thoiGian * tam.x;
    tam.vx = 0;
    tam.vy = 0;
  }

  @Override
  public void sangPhai(double thoiGian) {
    tam.x += thoiGian * tam.x;
    tam.vx = 0;
    tam.vy = 0;
  }

}

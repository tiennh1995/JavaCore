package oop;

public class Sach {
  private String ten;
  private TacGia tacGia;
  private float gia;
  private int soTrang;

  public Sach(String ten, TacGia tacGia, float gia, int soTrang) {
    this.ten = ten;
    this.tacGia = tacGia;
    this.gia = gia;
    this.soTrang = soTrang;
  }

  public TacGia getTacGia() {
    return tacGia;
  }

  public void setTacGia(TacGia tacGia) {
    this.tacGia = tacGia;
  }

  public float getGia() {
    return gia;
  }

  public void setGia(float gia) {
    this.gia = gia;
  }

  public int getSoTrang() {
    return soTrang;
  }

  public void setSoTrang(int soTrang) {
    this.soTrang = soTrang;
  }

  public String getTen() {
    return ten;
  }

  public String toString() {
    return "Ten: " + this.ten + "\nTac gia: " + this.tacGia.getTen() + "\nGia: " + this.gia + "\nSo trang: "
        + this.soTrang;
  }
}

package oop;

public class TacGia {
  private String ten;
  private String email;
  private String thongTinTacGia;

  public TacGia(String ten, String email, String thongTinTacGia) {
    this.ten = ten;
    this.email = email;
    this.thongTinTacGia = thongTinTacGia;
  }

  public String toString() {
    return "Ten: " + this.ten + "\nEmail: " + this.email + "\nThong tin tac gia: " + this.thongTinTacGia;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getThongTinTacGia() {
    return thongTinTacGia;
  }

  public void setThongTinTacGia(String thongTinTacGia) {
    this.thongTinTacGia = thongTinTacGia;
  }

  public static void main(String[] args) {
    TacGia tg = new TacGia("Nguyen Huu Tien", "tiennh1995@gmail.com", "Ha Noi");
    System.out.println(tg.toString());
  }
}

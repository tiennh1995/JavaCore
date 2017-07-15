/**
 * 
 */
package collection;

import java.util.Date;

/**
 * @author Nguyen Huu Tien
 */
public class NguoiGuiTien implements Comparable<NguoiGuiTien>{
  private int ma;
  private String hoTen;
  private String diaChi;
  private String soDienThoai;
  private Date ngaySinh;
  
  public NguoiGuiTien(int ma, String hoTen, String diaChi, String soDienThoai, Date ngaySinh) {
    this.ma = ma;
    this.hoTen = hoTen;
    this.diaChi = diaChi;
    this.soDienThoai = soDienThoai;
    this.ngaySinh = ngaySinh;
  }
  
  public int getMa() {
    return ma;
  }
  public void setMa(int ma) {
    this.ma = ma;
  }
  public String getHoTen() {
    return hoTen;
  }
  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }
  public String getDiaChi() {
    return diaChi;
  }
  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }
  public String getSoDienThoai() {
    return soDienThoai;
  }
  public void setSoDienThoai(String soDienThoai) {
    this.soDienThoai = soDienThoai;
  }
  public Date getNgaySinh() {
    return ngaySinh;
  }
  public void setNgaySinh(Date ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  @Override
  public int compareTo(NguoiGuiTien o) {
    return this.ma > o.ma ? 1 : this.ma == o.ma ? 0 : -1;
  }
}

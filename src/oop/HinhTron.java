package oop;

public class HinhTron {
  private double banKinh;

  public HinhTron() {
    this(0);
  }

  public HinhTron(double banKinh) {
    this.banKinh = banKinh;
  }

  public double getBanKinh() {
    return this.banKinh;
  }

  public double calArea() {
    return Math.PI * Math.pow(this.getBanKinh(), 2);
  }

  public String toString() {
    return "Ban kinh: " + this.getBanKinh() + "\nDien tich: " + this.calArea();
  }
}

package midtermexam;

public class HinhTru extends HinhTron {
  private double chieuCao;

  public HinhTru() {
  	this(0, 0);
  }

  public HinhTru(double banKinh, double chieuCao) {
    super(banKinh);
    this.chieuCao = chieuCao;
  }

  public double getChieuCao() {
    return chieuCao;
  }

  public double calVolume() {
    return this.getChieuCao() * this.calArea();
  }
}

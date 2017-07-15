package midtermexam;

public class KiemTraHinhTru {
  public static void main(String[] args) {
  	// Truong hop co tham so
  	HinhTron hTron = new HinhTron(10);
  	System.out.println("Ban kinh hinh tron: " + hTron.getBanKinh());
  	System.out.println("Dien tich hinh tron: " + hTron.calArea());
  	System.out.println("Thong tin hinh tron: \n" + hTron.toString());
    HinhTru hTru = new HinhTru(2, 3);
    System.out.println("Chieu cao hinh tru: " + hTru.getChieuCao());
    System.out.println("The tich hinh tru: " + hTru.calVolume());
    
    // Truong hop khong tham so
  	HinhTron hTron0 = new HinhTron();
  	System.out.println("Ban kinh hinh tron: " + hTron0.getBanKinh());
  	System.out.println("Dien tich hinh tron: " + hTron0.calArea());
  	System.out.println("Thong tin hinh tron: \n" + hTron0.toString());
    HinhTru hTru0 = new HinhTru();
    System.out.println("Chieu cao hinh tru: " + hTru0.getChieuCao());
    System.out.println("The tich hinh tru: " + hTru0.calVolume());
  }
}

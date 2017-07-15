/**
 * 
 */
package collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TreeMap;

/**
 * @author Nguyen Huu Tien
 */
public class TestNguoiGuiTien {

  public static void main(String[] args) throws ParseException {
    TreeMap<NguoiGuiTien, Double> tm = new TreeMap<>();
    NguoiGuiTien ng1 = new NguoiGuiTien(1, "NHT1", "Ha noi", "1234567891", new SimpleDateFormat("yyyy-MM-dd").parse("1995-11-05"));
    NguoiGuiTien ng2 = new NguoiGuiTien(2, "NHT2", "Ha noi", "1234567892", new SimpleDateFormat("yyyy-MM-dd").parse("1995-11-06"));
    NguoiGuiTien ng3 = new NguoiGuiTien(3, "NHT3", "Ha noi", "1234567893", new SimpleDateFormat("yyyy-MM-dd").parse("1995-11-07"));
    NguoiGuiTien ng4 = new NguoiGuiTien(4, "NH4", "Ha noi", "1234567894", new SimpleDateFormat("yyyy-MM-dd").parse("1995-11-08"));
    NguoiGuiTien ng = new NguoiGuiTien(4, "NH5", "Ha noi", "1234567895", new SimpleDateFormat("yyyy-MM-dd").parse("1995-11-09"));
    tm.put(ng1, 80.0);
    tm.put(ng2, 70.0);
    tm.put(ng3, 50.0);
    tm.put(ng4, 100.0);
    Double soTien = 0.0;
    if((soTien = tm.get(ng)) != null) {
      tm.put(ng, soTien - 10);
    } else {
      tm.put(ng, 0.0);
    }
    
    System.out.println(tm.get(ng));
  }
}

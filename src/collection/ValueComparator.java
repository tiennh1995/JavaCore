/**
 * 
 */
package collection;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Nguyen Huu Tien
 */
public class ValueComparator implements Comparator<NguoiGuiTien> {
  TreeMap<NguoiGuiTien, Double> tm;

  public ValueComparator(TreeMap<NguoiGuiTien, Double> tm) {
    this.tm = tm;
  }

  @Override
  public int compare(NguoiGuiTien o1, NguoiGuiTien o2) {
    Double d1 = tm.get(o1), d2 = tm.get(o2);
    if (d1 == d2)
      return o1.getMa() > o2.getMa() ? 1 : o1.getMa() == o2.getMa() ? 0 : -1;
    else
      return d1 > d2 ? 1 : d1 == d2 ? 0 : -1;
  }
}

/**
 * 
 */
package collection;

import java.util.HashSet;

/**
 * @author Nguyen Huu Tien
 */
public class TestHashSet {
  public static <T> void main(String[] args) {
    HashSet<String> std = new HashSet<String>();
    std.add("NHT2");
    std.add("NHT3");
    std.add("NHT1");

    String str = new String("NHT3");
    System.out.println(std.contains(str));

    HashSet<String> stdByStr = new HashSet<String>();
    
    stdByStr.addAll(std);
  }
}

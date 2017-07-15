/**
 * 
 */
package collection;

import java.util.TreeMap;

/**
 * @author Nguyen Huu Tien
 */
public class TestTreeMap {
  public static void main(String[] args) {
    TreeMap<Integer, Book> tmap = new TreeMap<>();
    tmap.put(1, new Book("Tutorial Java 1.1", "A1", 1990));
    tmap.put(10, new Book("Tutorial Java 1.2", "A1", 1995));
    tmap.put(5, new Book("Tutorial Pascal", "C1", 1980));
    
    System.out.println(tmap.containsKey(1));
    
    Book b = tmap.get(100);
    System.out.println(b.getAuthor());
  }
}

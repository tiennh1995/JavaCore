package collection;

import java.util.HashMap;

/**
 * @author Nguyen Huu Tien
 */
public class TestHashMap {
  public static void main(String[] args) {
    HashMap<Integer, Book> hm = new HashMap<>();
    hm.put(1, new Book("Tutorial Java 1.1", "A1", 1990));
    hm.put(10, new Book("Tutorial Java 1.2", "A1", 1995));
    hm.put(5, new Book("Tutorial Pascal", "C1", 1980));
    
    System.out.println(hm.containsKey(1));
    
    Book b = hm.get(10);
    System.out.println(b.getAuthor());
  }
}

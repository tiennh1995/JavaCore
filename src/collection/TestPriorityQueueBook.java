package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author Nguyen Huu Tien
 */
public class TestPriorityQueueBook {
  public static void main(String[] args) {
    PriorityQueue<Book> pQ = new PriorityQueue<Book>();
    pQ.add(new Book("Tutorial Pascal", "A1", 1980));
    pQ.add(new Book("Tutorial Java 1.1", "C1", 1990));
    pQ.add(new Book("Tutorial Java 1.2", "A1", 1995));
    Iterator<Book> i = pQ.iterator();
    while (i.hasNext()) {
      System.out.println(i.next().getAuthor());
    }
  }
}

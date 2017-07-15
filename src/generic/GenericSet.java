/**
 * 
 */
package generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Nguyen Huu Tien
 */
public class GenericSet<T> {
  private ArrayList<T> al;
  
  public GenericSet() {
    al = new ArrayList<T>();
  }
  
  public GenericSet(ArrayList<T> elements) {
    Iterator<T> it = elements.iterator();
    while(it.hasNext())
      al.add(it.next());
  }

  public GenericSet(GenericSet<T> s) {
    Iterator<T> it =  s.al.iterator();
    while(it.hasNext())
      al.add(it.next());   
  }
  
  public void insert(T element) {
    al.add(element);
  }
  
  public ArrayList<T> getAl() {
    return al;
  }
}

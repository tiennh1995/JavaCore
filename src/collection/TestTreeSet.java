/**
 * 
 */
package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Nguyen Huu Tien
 */
public class TestTreeSet {
  public static void main(String[] args) {
    TreeSet<Student> std = new TreeSet<Student>();
    std.add(new Student(9, "NHT2"));
    std.add(new Student(8, "NHT3"));
    std.add(new Student(10, "NHT1"));

    Student s1 = new Student(10, "NHT3");
    System.out.println(std.contains(s1));

    SortedSet<Student> stdByScore = new TreeSet<Student>(new Comparator<Student>() {
      @Override
      public int compare(Student s1, Student s2) {
        return s1.getScoreAvarage() > s2.getScoreAvarage() ? 1 : s1.getScoreAvarage() == s2.getScoreAvarage() ? 0 : -1;
      }
    });
    
    stdByScore.addAll(std);
    Iterator<Student> iter = stdByScore.iterator();
    System.out.println(stdByScore.contains(s1));
    while(iter.hasNext())
      System.out.println(iter.next().getScoreAvarage());
  }
}

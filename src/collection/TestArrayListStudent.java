/**
 * 
 */
package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Nguyen Huu Tien
 */
public class TestArrayListStudent {
  public static void main(String[] args) {
    ArrayList<Student> std = new ArrayList<Student>();
    std.add(new Student(9, "NHT2"));
    std.add(new Student(10, "NHT1"));
    std.add(new Student(8, "NHT3"));

    Collections.sort(std);
    Student s1 = new Student(9, "NHT1");
    int i = Collections.binarySearch(std, s1);
    if (i >= 0) {
      System.out.println("Found by name");
      System.out.println(std.get(i).getScoreAvarage());
    }
    
    Comparator<Student> com = new Comparator<Student>() {
      public int compare(Student s1, Student s2) {
        return s1.getScoreAvarage() > s2.getScoreAvarage() ? 1 : s1.getScoreAvarage() == s2.getScoreAvarage() ? 0 : -1;
      }
    };

    std.sort(com);

    s1 = new Student(8, "NHT2");
    i = Collections.binarySearch(std, s1, com);

    if (i >= 0) {
      System.out.println("Found by name");
      System.out.println(std.get(i).getName());
    }
  }
}

package binarysearch;

import java.util.PriorityQueue;

/**
 * Nguyen Huu Tien
 * Su dung hang doi uu tien de quan ly sinh vien
 */
public class TestPriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<Student> pq = new PriorityQueue<>();

    Student s3 = new Student(9, "NHT3");
    Student s1 = new Student(1, "NHT");
    Student s2 = new Student(2, "LTHH");
    pq.add(s1);
    pq.add(s3);
    pq.add(s2);
    System.out.println(pq.peek().getName());
    pq.remove();
    System.out.println(pq.peek().getName());
    pq.remove();
    System.out.println(pq.peek().getName());
  }
}

package binarysearch;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Nguyen Huu Tien
 * Su dung ArrayList va LinkedList de them, xoa, sua, tim kiem, duyet doi voi Person
 */
public class TestPerson {
  public static void main(String[] args) {
    ArrayList<Person> arrPerson = new ArrayList<>();
    LinkedList<Person> lnkPerson = new LinkedList<>();
    PersonPredicate pp = new PersonPredicate();

    // Test ArrayList
    Person p1 = new Person("NHT1", 23, "male");
    Person p2 = new Person("NHT2", 23, "male");

    // Add
    arrPerson.add(p1);
    arrPerson.add(p2);

    // Delete
    System.out.println("TEST DELETE--------------------");
    pp.name = "NHT2";
    arrPerson.removeIf(pp);
    System.out.println("Sau khi xoa phan tu cuoi: " + arrPerson.get(0).getName());

    // Change
    System.out.println("TEST CHANGE--------------------");
    Person p3 = arrPerson.get(0);
    System.out.println("Phan tu dau truoc khi sua: " + p3.getName());
    p3.setName("NHT3");
    arrPerson.set(0, p3);
    System.out.println("Phan tu dau sau khi sua: " + arrPerson.get(0).getName());

    // Search
    System.out.println("TEST SEARCH-------------------------");
    System.out.println("Ket qua seach: " + arrSearch(arrPerson, "NHT3"));

    // Traversel
    System.out.println("TEST TRAVERSAL--------------------");
    arrPerson.forEach(new PersonConsumer());

    // Test LinkedList

    // ADD
    lnkPerson.add(p1);
    lnkPerson.add(p2);
    pp.name = "NHT3";

    // DELETE
    System.out.println("TEST DELETE ----------------------------");
    lnkPerson.removeIf(pp);
    System.out.println(lnkPerson.getFirst().getName());

    // CHANGE
    System.out.println("TEST CHANGE-------------------");
    p1.setName("NHT1");
    lnkPerson.set(0, p1);
    System.out.println(lnkPerson.getFirst().getName());

    // SEARCH
    System.out.println("TEST SEARCH-------------------------");
    System.out.println("Ket qua seach: " + lnkSearch(lnkPerson, "NHT3"));    

    // Traversal
    System.out.println("TEST TRAVERSAL--------------------------");
    lnkPerson.forEach(new PersonConsumer());

  }

  public static int arrSearch(ArrayList<Person> persons, String name) {
    for (int i = 0; i < persons.size(); i++)
      if (persons.get(i).getName().equals(name))
        return i;
    return -1;
  }

  public static int lnkSearch(LinkedList<Person> persons, String name) {
    for (int i = 0; i < persons.size(); i++)
      if (persons.get(i).getName().equals(name))
        return i;
    return -1;
  }
}

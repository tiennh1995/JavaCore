package binarysearch;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Nguyen Huu Tien
 * class Person de phuc vu dung ArrayList va LinkedList
 */
public class Person {
  private String name;
  private int age;
  private String sex;

  public Person(String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
}

class PersonPredicate implements Predicate<Person> {
  String name;

  @Override
  public boolean test(Person p) {
    return p.getName().equals(name);
  }
}

class PersonConsumer implements Consumer<Person> {
  @Override
  public void accept(Person p) {
    System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + ", Sex: " + p.getSex());
  }
}

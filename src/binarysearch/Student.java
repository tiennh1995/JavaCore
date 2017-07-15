package binarysearch;

/**
 * Nguyen Huu Tien
 * class Student phuc vu bai tap su dung hang doi uu tien, quan ly sinh vien
 */
public class Student implements Comparable<Student> {
  private int scoreAvarage;
  private String name;

  public Student(int scoreAvarage, String name) {
    this.scoreAvarage = scoreAvarage;
    this.name = name;
  }

  public int getScoreAvarage() {
    return scoreAvarage;
  }

  public void setScoreAvarage(int scoreAvarage) {
    this.scoreAvarage = scoreAvarage;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Student o) {
    return this.getName().compareTo(o.getName());
  }
}

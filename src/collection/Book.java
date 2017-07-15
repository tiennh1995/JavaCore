/**
 * 
 */
package collection;

/**
 * @author Nguyen Huu Tien
 */
public class Book implements Comparable<Book> {
  private String title;
  private String author;
  private Integer year;

  public Book(String title, String author, Integer year) {
    this.title = title;
    this.author = author;
    this.year = year;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @Override
  public int compareTo(Book o) {
    return this.author.compareTo(o.author) < 0 ? -1 : this.author.compareTo(o.author) == 0 ? 0 : 1;
  }
}

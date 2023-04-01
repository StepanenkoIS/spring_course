package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Book {

  @Value("Герой нашего времени")
  private String name;

  @Value("Михаил Юрьевич Лермонтов")
  private String author;

  @Value("1840")
  private int yearPublication;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getYearPublication() {
    return yearPublication;
  }

  public void setYearPublication(int yearPublication) {
    this.yearPublication = yearPublication;
  }
}

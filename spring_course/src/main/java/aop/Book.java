package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Book {

  @Value("Герой нашего времени")
  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

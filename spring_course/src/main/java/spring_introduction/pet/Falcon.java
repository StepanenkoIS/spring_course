package spring_introduction.pet;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("falconBean")
//@Scope("prototype")
public class Falcon implements Pet {

  private String name;

  public Falcon() {
    System.out.println("Falcon bean is created");

  }

  @PostConstruct
  public void init () {
    System.out.println("Class Falcon: init method");
  }

  @PreDestroy
  public void destroy () {
    System.out.println("Class Falcon: destroy method");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void say() {
    System.out.println("Quack quack");

  }
}

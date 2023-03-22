package spring_introduction.pet;

public class Lion implements Pet {


  public Lion() {
    System.out.println("Lion bean is created");
  }

  @Override
  public void say() {
    System.out.println("Leon: RRRRRRrrrrrr");
  }

  public void init () {
    System.out.println("Class Lion: init method");
  }

  public void destroy () {
    System.out.println("Class Lion: destroy method");
  }
}

package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.pet.Pet;

public class Test2 {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.context.xml");

    Pet pet = context.getBean("myPet", Pet.class);
    pet.say();

    context.close();
  }
}

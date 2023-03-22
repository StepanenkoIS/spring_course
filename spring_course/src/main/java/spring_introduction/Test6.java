package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.pet.Pet;

public class Test6 {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    Man man = context.getBean("manBean", Man.class);
//    man.callYouPet();
//
//    Pet cat = context.getBean("catBean", Pet.class);
//    cat.say();

    System.out.println(man.getAge());
    System.out.println(man.getSurname());

    context.close();

  }
}

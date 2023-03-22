package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.context3.xml");
//    Cat myCat = context.getBean("catBean", Cat.class);
//    myCat.say();

    Man man = context.getBean("manBean", Man.class);
    man.callYouPet();


    System.out.println(man.getSurname());
    System.out.println(man.getAge());

    context.close();
  }
}

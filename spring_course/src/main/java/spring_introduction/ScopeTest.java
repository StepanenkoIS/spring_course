package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.pet.Falcon;

public class ScopeTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.context3.xml");

    Falcon myFalcon = context.getBean("falconBean", Falcon.class);
    Falcon herFalcon = context.getBean("falconBean", Falcon.class);
    System.out.println("Переменные ссылаются на один и тот же объект? -> " + (myFalcon == herFalcon));
    myFalcon.say();


    context.close();
  }


}

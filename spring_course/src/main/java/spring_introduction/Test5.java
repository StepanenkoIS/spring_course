package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.pet.Lion;

public class Test5 {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.context2.xml");
    Lion lion = context.getBean("myPet3", Lion.class);
    lion.say();

    Lion lion2 = context.getBean("myPet3", Lion.class);
    lion2.say();
    context.close();

/* Вывод singlonetone
Dog bean is created
Lion bean is created
Class Lion: init method
Leon: RRRRRRrrrrrr
Class Lion: destroy method
*/
  }
}

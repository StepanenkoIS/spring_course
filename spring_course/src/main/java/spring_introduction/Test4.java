package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.pet.Dog;

public class Test4 {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.context2.xml");
/*Singletone*/
    System.out.println("--Singletone--");
    Dog myDog = context.getBean("myPet", Dog.class);
    myDog.setName("Белка");
    Dog yourDog = context.getBean("myPet", Dog.class);
    yourDog.setName("Стрекла");

    System.out.println(myDog.getName());
    System.out.println(yourDog.getName());


    System.out.println("Переменные ссылаются на один объект? -> " + (myDog==yourDog));
    System.out.println(myDog);
    System.out.println(yourDog);
    System.out.println();

    /*Prototype*/
    System.out.println("--Prototype--");
    Dog myDog2 = context.getBean("myPet2", Dog.class);
    myDog2.setName("Жучка");
    Dog yourDog2 = context.getBean("myPet2", Dog.class);
    yourDog2.setName("Рекс");

    System.out.println(myDog2.getName());
    System.out.println(yourDog2.getName());


    System.out.println("Переменные ссылаются на один объект? -> " + (myDog2==yourDog2));
    System.out.println(myDog2);
    System.out.println(yourDog2);
    context.close();
  }
}

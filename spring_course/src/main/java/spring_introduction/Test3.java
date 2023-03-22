package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

  public static void main(String[] args) {
//    Pet pet = new Cat();
//    Person person = new Person(pet);
//    person.callYouPet();

//    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.context.xml");
//    Pet pet = context.getBean("myPet", Pet.class);
//    Person person = new Person(pet);
//    person.callYouPet();
//    context.close();

    //Спосбо 1/2: Внедрение зависимостей c помощью конструктора / сеттеров
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.context.xml");
    Person person = context.getBean("myPerson", Person.class);
    person.callYouPet();

    System.out.println(person.getSurname());
    System.out.println(person.getAge());
    context.close();

  }
}

package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test3 {
  public static void main(String[] args) {
    System.out.println("starts main");
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

    UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
    String bokkName = uniLibrary.returnBook();
    System.out.println("В библиотеку вернули книгу: " + bokkName);
    context.close();
    System.out.println("ends main");

  }
}

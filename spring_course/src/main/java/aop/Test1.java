package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
    uniLibrary.getBook();
//    uniLibrary.returnBook();
    uniLibrary.getMagazine();
//    uniLibrary.returnMagazine();
//    uniLibrary.addBook();
//    context.close();

  }
}

package hibernate_test;

import hibernate_test.entyty.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {

  public static void main(String[] args) {
    // Создание SessionFactory, configure() - можно не указывать название файла если оно стандартное
    SessionFactory factory = new Configuration()
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .buildSessionFactory();

    try {
      Session session = factory.getCurrentSession();
      session.beginTransaction();

      //"from Employee" - указывается имя Класса
      List<Employee> list = session.createQuery("from Employee").getResultList();
      for (Employee e: list)
        System.out.println(e);


      List<Employee> list2 = session.createQuery("from Employee where name = 'Alex'").getResultList();
      for (Employee e: list2)
        System.out.println(e);

      List<Employee> list3 = session.createQuery("from Employee where name = 'Alex' AND salary>750").getResultList();
      for (Employee e: list3)
        System.out.println(e);

      session.getTransaction().commit();


      System.out.println("All ok!");

    } finally {
      factory.close();
    }



  }
}

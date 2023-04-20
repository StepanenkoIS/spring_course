package hibernate_test;

import hibernate_test.entyty.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {

  public static void main(String[] args) {
    // Создание SessionFactory, configure() - можно не указывать название файла если оно стандартное
    SessionFactory factory = new Configuration()
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .buildSessionFactory();

    try {
      Session session = factory.getCurrentSession();
      session.beginTransaction();

      //Удаление контректного объекта
      Employee employee = session.get(Employee.class, 23);
      session.delete(employee);

      //Удаление нескольких объектов
      session.createQuery("delete Employee where name = 'Alex'").executeUpdate();

      session.getTransaction().commit();
      System.out.println("All ok!");

    } finally {
      factory.close();
    }



  }
}

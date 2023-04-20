package hibernate_test;

import hibernate_test.entyty.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {

  public static void main(String[] args) {
    // Создание SessionFactory, configure() - можно не указывать название файла если оно стандартное
    SessionFactory factory = new Configuration()
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .buildSessionFactory();

    try {
      Session session = factory.getCurrentSession();
      session.beginTransaction();

      //Изменить данные у контретного объекта
      Employee employee = session.get(Employee.class, 23);
      employee.setSalary(9999);

      //Изменить значение у нескольких объектов
      session.createQuery("update Employee set salary=1001 where name = 'Alex'").executeUpdate();

      session.getTransaction().commit();
      System.out.println("All ok!");

    } finally {
      factory.close();
    }



  }
}

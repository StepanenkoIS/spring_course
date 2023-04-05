package hibernate_test;

import hibernate_test.entyty.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

  public static void main(String[] args) {
    // Создание SessionFactory, configure() - можно не указывать название файла если оно стандартное
    SessionFactory factory = new Configuration()
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .buildSessionFactory();

    //Получение сессии
    Session session = factory.getCurrentSession();

    Employee employee = new Employee("Ivan", "Ivanov", "IT", 500);

    //Открытие транзакции
    session.beginTransaction();

    session.save(employee);

    //Закрытие транзакции
    session.getTransaction().commit();





  }
}

package hibernate_test;

import hibernate_test.entyty.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

  public static void main(String[] args) {
    // Создание SessionFactory, configure() - можно не указывать название файла если оно стандартное
    SessionFactory factory = new Configuration()
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .buildSessionFactory();

    try {
      //Получение сессии
      Session session = factory.getCurrentSession();
      Employee employee = new Employee("Oleg", "Sidorov", "HR", 700);
      //Открытие транзакции
      session.beginTransaction();
      session.save(employee);
      //Закрытие транзакции
      session.getTransaction().commit();

      int myId = employee.getId();

      //Получение новой сессии после закрытия транзакции
      session = factory.getCurrentSession();
      session.beginTransaction();
      //Получение из БД работника по id
      Employee employeeWithBD = session.get(Employee.class, myId);
      session.getTransaction().commit();

      System.out.println(employeeWithBD);

      System.out.println("All ok!");

    } finally {
      //Закрытие
      factory.close();
    }



  }
}

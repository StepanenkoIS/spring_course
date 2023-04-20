package hibernate_test_2;

import hibernate_test_2.entyty.Detail;
import hibernate_test_2.entyty.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .addAnnotatedClass(Detail.class)
      .buildSessionFactory();

    Session session = null;
    try {


//      Employee employee = new Employee("Alex", "Sidorov", "IT", 500);
//      Detail detail = new Detail("Baku", "9123456789", "test@test.com");


//      Employee employee = new Employee("Rina", "Ivanova", "HR", 400);
//      Detail detail = new Detail("Moscow", "9123456790", "rina@test.com");

//      employee.setEmpDetail(detail);
//      session.beginTransaction();
//      session.save(employee);

      session = factory.getCurrentSession();
      session.beginTransaction();
      Employee employee = session.get(Employee.class, 2);
      session.delete(employee);


      session.getTransaction().commit();
      System.out.println("All ok!");

    } finally {
      //закрытие сессии транзакции  Cleaning up connection pool
      session.close();
      //Закрытие
      factory.close();
    }


  }
}

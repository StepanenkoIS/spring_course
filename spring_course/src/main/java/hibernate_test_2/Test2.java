package hibernate_test_2;

import hibernate_test_2.entyty.Detail;
import hibernate_test_2.entyty.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .addAnnotatedClass(Detail.class)
      .buildSessionFactory();

    Session session = null;
    try {
/*
      Запись в БД
      session = factory.getCurrentSession();
      Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850);
      Detail detail = new Detail("New-York", "912345678911", "nikolay@test.com");
      employee.setEmpDetail(detail);
      detail.setEmployee(employee);
      session.beginTransaction();
      session.save(detail);
      session.getTransaction().commit();
      */

      //Получение из БД Вывод Employee через Detail
//      session = factory.getCurrentSession();
//      session.beginTransaction();
//      Detail detail  = session.get(Detail.class, 4);
//      session.getTransaction().commit();
//      System.out.println(detail.getEmployee());

      //Удаление из БД
      session = factory.getCurrentSession();
      session.beginTransaction();
      Detail detail  = session.get(Detail.class, 1);

      //Удаляем зависимость
      detail.getEmployee().setEmpDetail(null);

      session.delete(detail);
      session.getTransaction().commit();
      System.out.println();




      System.out.println("All ok!");

    } finally {
      //закрытие сессии транзакции  Cleaning up connection pool
      session.close();
      //Закрытие
      factory.close();
    }


  }
}

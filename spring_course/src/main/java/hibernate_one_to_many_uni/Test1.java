package hibernate_one_to_many_uni;



import hibernate_one_to_many_uni.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .addAnnotatedClass(Department.class)
      .buildSessionFactory();

    Session session = null;
    try {
//      session = factory.getCurrentSession();
//      session.beginTransaction();
//      Department dep = new Department("HR", 300, 1200);
//      Employee empl1 = new Employee("Alexa", "Sidorova",  500);
//      Employee empl2 = new Employee("Toma", "Koshkina", 1000);
//      dep.addEmployeeToDepartment(empl1);
//      dep.addEmployeeToDepartment(empl2);
//
//      //Сохранится департамент и оба работника
//      session.save(dep)  ;
//
//      session.getTransaction().commit();
//      System.out.println("All ok!");


//      session = factory.getCurrentSession();
//      session.beginTransaction();
//      Department dep = session.get(Department.class, 5);
//      System.out.println(dep);
//      System.out.println(dep.getEmps());
//      session.getTransaction().commit();
//      System.out.println("All ok!");


//      session = factory.getCurrentSession();
//      session.beginTransaction();
//      Employee emp1 = session.get(Employee.class, 6);
//      session.delete(emp1);
//      session.getTransaction().commit();
//      System.out.println("All ok!");

//      session = factory.getCurrentSession();
//      session.beginTransaction();
//      Department department = session.get(Department.class, 6);
//      session.delete(department);
//      session.getTransaction().commit();
//      System.out.println("All ok!");


    } finally {
      //закрытие сессии транзакции  Cleaning up connection pool
      session.close();
      //Закрытие
      factory.close();
    }


  }
}

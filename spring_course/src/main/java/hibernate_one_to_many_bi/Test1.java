package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
//      Department dep = new Department("Sales", 300, 1200);
//      Employee empl1 = new Employee("Alex", "Sidorov",  500);
//      Employee empl2 = new Employee("Rina", "Ivanova", 1000);
//      Employee empl3 = new Employee("Anton", "Antonov", 1200);
//      dep.addEmployeeToDepartment(empl1);
//      dep.addEmployeeToDepartment(empl2);
//      dep.addEmployeeToDepartment(empl3);
//      //Сохранится департамент и всех работников
//      session.save(dep)  ;
//      session.getTransaction().commit();
//      System.out.println("All ok!");


      session = factory.getCurrentSession();
      session.beginTransaction();
      System.out.println("Get department");
      Department dep = session.get(Department.class, 8);
      System.out.println("Show department");
      System.out.println(dep);

      System.out.println("Подгрузить работников");
      dep.getEmps().get(0);

      session.getTransaction().commit();

      System.out.println("Show employee");
      System.out.println(dep.getEmps());

      System.out.println("All ok!");

//      session = factory.getCurrentSession();
//      session.beginTransaction();
//      Employee emp1 = session.get(Employee.class, 4);
//      session.delete(emp1);
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

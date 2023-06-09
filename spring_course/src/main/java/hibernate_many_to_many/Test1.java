package hibernate_many_to_many;


import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {


  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Child.class)
      .addAnnotatedClass(Section.class)
      .buildSessionFactory();

    Session session = null;

    try {
      /*--------------------Каскадное сохранение через Section ---------------------------------------*/
//      session = factory.getCurrentSession();
//
//      Section section1 = new Section("Football");
//
//      Child child1 = new Child("Masha", 5);
//      Child child2 = new Child("Dima", 4);
//      Child child3 = new Child("Albert", 6);
//
//      section1.addChildToSection(child1);
//      section1.addChildToSection(child2);
//      section1.addChildToSection(child3);
//      session.beginTransaction();
//      session.save(section1);
//      session.getTransaction().commit();

      /*---------------------Получение Child--------------------------------------*/

//      session = factory.getCurrentSession();
//
//      Section section2 = new Section("Swimming pool");
//      Section section3 = new Section("Volleyball");
//      Section section4 = new Section("Ski");
//
//      Child child4 = new Child("Anton", 10);
//
//
//      child4.addSectionToChild(section2);
//      child4.addSectionToChild(section3);
//      child4.addSectionToChild(section4);
//
//      session.beginTransaction();
//      session.save(child4);
//      session.getTransaction().commit();

      /*----------------------Получение Section-------------------------------------*/

//      session = factory.getCurrentSession();
//      session.beginTransaction();
//
//      Section section = session.get(Section.class, 1);
//      System.out.println("section -> " + section);
//      System.out.println("getChildren -> " + section.getChildren());
//
//      session.getTransaction().commit();

      /*--------------------------Удаление---------------------------------*/
//      session = factory.getCurrentSession();
//      session.beginTransaction();
//
//      Child child = session.get(Child.class, 5);
//      System.out.println("child -> " + child);
//      System.out.println("getSections -> " + child.getSections());
//
//      session.getTransaction().commit();

      /*--------------------Удаление---------------------------------------*/

//      session = factory.getCurrentSession();
//      session.beginTransaction();
//
//      Section section = session.get(Section.class, 1);
//
//      session.delete(section);
//      session.getTransaction().commit();

      /*--------------------Сохранение через persist ---------------------------------------*/


//      session = factory.getCurrentSession();
//
//      Section section1 = new Section("Dance");
//
//      Child child1 = new Child("Olga", 5);
//      Child child2 = new Child("Roma", 4);
//      Child child3 = new Child("Alex", 6);
//
//      section1.addChildToSection(child1);
//      section1.addChildToSection(child2);
//      section1.addChildToSection(child3);
//
//      session.beginTransaction();
//      session.persist(section1);
//      session.getTransaction().commit();


      /*----------------------Улдаление только session -------------------------------------*/
//
//      session = factory.getCurrentSession();
//      session.beginTransaction();
//
//      Section section = session.get(Section.class, 10);
//
//      session.delete(section);
//      session.getTransaction().commit();

      /*----------------------Улдаление только Child -------------------------------------*/

      session = factory.getCurrentSession();
      session.beginTransaction();

      Child child = session.get(Child.class, 4);

      session.delete(child);
      session.getTransaction().commit();

      System.out.println("<--Done-->");
    } finally {
      session.close();
      factory.close();
    }






  }
}

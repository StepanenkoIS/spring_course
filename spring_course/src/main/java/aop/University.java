package aop;

import aop.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class University {

  private List<Student> students = new ArrayList<>();

  public void addStudent() {
    Student student1 = new Student("Томас Андерсон", 1, 9.8);
    Student student2 = new Student("Морфеуc Иванов", 5, 8.3);
    Student student3 = new Student("Три́нити Петрова", 3, 9.8);
    students.add(student1);
    students.add(student2);
    students.add(student3);
  }

  public List<Student> getStudents() {
    System.out.println("Старт работы метода getStudents");

    //Для выброса Исключения
    System.out.println(students.get(100));

    System.out.println("Information from method getStudents: ");
    System.out.println(students);
    return students;
  }


}

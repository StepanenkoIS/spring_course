package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring_introduction.pet.Pet;

//@Component("manBean")
public class Man {

//  @Autowired
//  @Qualifier(value = "falconBean")
  private Pet pet;

  @Value("${person.surname}")
  private String surname;

  @Value("${person.age}")
  private int age;

//  @Autowired
//  public Man( @Qualifier(value = "catBean") Pet pet) {
//    System.out.println("Man bean is Created");
//    this.pet = pet;
//  }

  public void callYouPet() {
    System.out.println("Hello, my Pet!");
    pet.say();
  }

  public Pet getPet() {
    return pet;
  }

  public Man(Pet pet) {
    this.pet = pet;
  }

  //  @Autowired
//  @Qualifier(value = "falconBean")
//  public void setPet(Pet pet) {
//    System.out.println("Class Man set Pet");
//    this.pet = pet;
//  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

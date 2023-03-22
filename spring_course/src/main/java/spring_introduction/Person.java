package spring_introduction;

import spring_introduction.pet.Pet;

public class Person {

  private Pet pet;

  private String surname;
  private int age;

/*  public Person(Pet pet) {
    System.out.println("Person bean is created");
    this.pet = pet;
  }*/


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    System.out.println("Class Person setSurname");
    this.surname = surname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    System.out.println("Class Person setAge");

    this.age = age;
  }

  public Person() {
    System.out.println("Констурктор создания Person");
  }

  public void callYouPet() {
    System.out.println("Hello, my Pet!");
    pet.say();
  }

  //конвертация pet -> setPet
  public void setPet(Pet pet) {
    System.out.println("Class Person set Pet");
    this.pet = pet;
  }
}

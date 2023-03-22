package spring_introduction;

import spring_introduction.pet.Cat;
import spring_introduction.pet.Dog;
import spring_introduction.pet.Pet;

public class Test1 {

  public static void main(String[] args) {
    Pet pet = new Dog();
    pet.say();

    Pet pet1 = new Cat();
    pet1.say();
  }
}

package lesson04.oop_inheritance;

public class ZooApp {
  public static void main(String[] args) {
    Animal a = new Animal();
    Animal dog1 = new Dog("Jack");
    Dog dog2 = new Dog("John");
    Cat cat = new Cat();

    System.out.println(a.name());
    System.out.println(dog1.name());
    System.out.println(dog2.name());
    System.out.println(cat.name());

    if (dog1 instanceof Animal)

    if (dog1 instanceof Dog) {
      ((Dog)dog1).bark();
    }

    dog2.bark();
  }
}

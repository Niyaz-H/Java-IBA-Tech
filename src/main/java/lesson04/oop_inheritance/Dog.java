package lesson04.oop_inheritance;

public class Dog extends Animal {

  String name;

  public Dog(String name) {
    this.name = name;
  }

  @Override
  public String name() {
    return String.format("Dog:%s", this.name);
  }

  void bark() {
    System.out.println("I can bark");
  }

}

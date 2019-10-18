package lesson03.override;

public class AnimalApp {
  public static void main(String[] args) {
    Animal a = new Animal();
    Cat c = new Cat();
    System.out.println(a.name());
    System.out.println(c.name());
  }
}

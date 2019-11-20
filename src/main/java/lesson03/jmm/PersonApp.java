package lesson03.jmm;

public class PersonApp {
  public static void main(String[] args) {
    Person.age = 55;
    Person.produce();
  }

  public static void main1(String[] args) {
    Person p1 = new Person();
    p1.name = "Alex";
    p1.age = 33;
    p1.make();

    Person p2 = new Person();
    p2.name = "Sergio";
    p2.age = 44;
    p2.make();

    Person.produce();

    System.out.println(p1.name);
    System.out.println(p1.age);

    System.out.println(p2.name);
    System.out.println(p2.age);
  }
}

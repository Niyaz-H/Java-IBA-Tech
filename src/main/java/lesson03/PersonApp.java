package lesson03;

public class PersonApp {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.name = "Alex";
    System.out.println(Person.getCounter());

    Person ann = new Person("Ann", true);
    System.out.println(Person.getCounter());

    Person p2 = new Person();
    p2.name = "Dima";
    System.out.println(Person.getCounter());

    Person p3 = new Person();
    p3.name = "Sergo";
    System.out.println(Person.getCounter());

//    Person.counter = 99;
    Person.setCounter(99);
    System.out.println(Person.getCounter());

    SmartPerson p4 = new SmartPerson();
    p4.name = "";

  }
}

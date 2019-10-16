package lesson03;

public class Person {
  String name;
  private static int counter = 0;
  private boolean isMember;

  public Person() {
    this.isMember = false;
    counter++;
  }

  public Person(String name_) {
    this(name_, false);
//    this.name = name_;
//    this.isMember = false;
//    counter++;
  }

  public Person(String name_, boolean isMember) {
    this.name = name_;
    this.isMember = isMember;
    counter++;
  }

  public static int getCounter() {
    return Person.counter;
  }

  public static void setCounter(int newVal) {
    Person.counter = newVal;
  }
}

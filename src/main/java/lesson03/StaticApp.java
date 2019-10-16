package lesson03;

public class StaticApp {
  public static void main(String[] args) {
    StaticX.smth = 111;

    StaticX st1 = new StaticX();
    StaticX st2 = new StaticX();

    st1.age = 33;
    st2.age = 44;

//    StaticX.age = 22;

    st1.smth = 66;
    st2.smth = 77;
    StaticX.smth = 88;

    System.out.println(st1.smth);
    System.out.println(st2.smth);
    System.out.println(StaticX.smth);

    SmartPerson smartPerson = new SmartPerson();


  }
}

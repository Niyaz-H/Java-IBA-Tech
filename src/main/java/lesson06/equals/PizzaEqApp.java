package lesson06.equals;

public class PizzaEqApp {
  public static void main(String[] args) {
    PizzaEq p1 = new PizzaEq(30);
    PizzaEq p2 = new PizzaEq(30);
    PizzaEq p3 = p1;

    if (p1 == p2) {} // false. references different
    if (p1 == p3) {} // true. references the same

    // true because of OVERRIDDEN equals
    if (p1.equals(p2)) {
      System.out.println("different objects w redefined equality (equals). same");
    } else {
      System.out.println("different objects w redefined equality (equals). different");
    }
    // true
    if (p1.equals(p3)) {
      System.out.println("same objects w redefined equality (equals). same");
    } else {
      System.out.println("same objects w redefined equality (equals). different");
    }
  }
}

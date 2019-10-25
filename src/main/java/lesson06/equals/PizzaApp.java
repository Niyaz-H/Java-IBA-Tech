package lesson06.equals;

public class PizzaApp {
  public static void main(String[] args) {
    Pizza p1 = new Pizza(30);
    Pizza p2 = new Pizza(30);
    Pizza p3 = p1;

    // false. references different
    if (p1 == p2) {
      System.out.println("different object by references (==). same");
    } else {
      System.out.println("different object by references (==). different");
    }
    // true. references the same
    if (p1 == p3) {
      System.out.println("same objects by references (==). same");
    } else {
      System.out.println("same objects by references (==). different");
    }

    // false
    if (p1.equals(p2)) {
      System.out.println("different objects w/o redefined equality (equals). same");
    } else {
      System.out.println("different objects w/o redefined equality (equals). different");
    }
    // true
    if (p1.equals(p3)) {
      System.out.println("same objects w/o redefined equality (equals). same");
    } else {
      System.out.println("same objects w/o redefined equality (equals). different");
    }
  }
}

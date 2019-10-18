package lesson03.testing;

// https://mvnrepository.com
// Junit
public class CalculatorTestApproachIdea {
  public static void main(String[] args) {
    Calculator c = new Calculator();

    if (c.add(1, 1) == 2) {
      System.out.println("OK");
    } else {
      System.out.println("WRONG");
    }

    if (c.add(100, 1) == 101) {
      System.out.println("OK");
    } else {
      System.out.println("WRONG");
    }
  }
}

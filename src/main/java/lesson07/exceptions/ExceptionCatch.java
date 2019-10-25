package lesson07.exceptions;

public class ExceptionCatch {
  public static void main(String[] args) {
    Calc c = new Calc();
    try {
      int z = c.div(1,0);
      float integral = c.integral();
    } catch (ArithmeticException ex) {
      System.out.println("it is impossible to divide by zero");
    } catch (IllegalArgumentException ex) {
      System.out.println("integral isn't implemented yet");
    }
  }
}

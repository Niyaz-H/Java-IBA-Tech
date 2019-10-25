package lesson07.exceptions;

public class Calc {

  public int div(int a, int b) {
//    if (b == 0) throw new IllegalArgumentException("CALC DIV 0");
    int c = a / b;
    return c;
  }

  public float integral(float... params) {
    throw new IllegalArgumentException("Not implemented yet");
  }

}

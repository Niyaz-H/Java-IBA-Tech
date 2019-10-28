package lesson07.exceptions;

import java.io.FileNotFoundException;

public class Calc {

  public int div(int a, int b) {
//    if (b == 0) throw new IllegalArgumentException("CALC DIV 0");
    int c = a / b;
    return c;
  }

  public float integral(float... params) {
    throw new IllegalArgumentException("Not implemented yet");
  }

  public double diff(double... params) throws Exception {
    throw new Exception("serious error");
  }

  public double diff2(double... params) {
    throw new RuntimeException("smth went wrong");
  }

}

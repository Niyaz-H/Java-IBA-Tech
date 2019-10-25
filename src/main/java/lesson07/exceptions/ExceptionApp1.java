package lesson07.exceptions;

public class ExceptionApp1 {

  public static void main(String[] args) {
    Calc c = new Calc();

    int outcome = c.div(1, 0);
    int x = Integer.parseInt("");
    float integral = c.integral(1,3,4,6,8);
    System.out.println(integral);


  }



}

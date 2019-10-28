package lesson07.exceptions;

public class ExceptionApp2 {

  public int calculation11(Calc c) {
    try {
      c.diff();
      return 1;
    } catch (Exception ex) {
      String message = ex.getMessage();
      return -1;
    }
  }

  public int calculation1(Calc c) throws Exception {
    c.diff();
    return 1;
  }

  public int calculation2(Calc c) {
    c.diff2();
    return 1;
  }


  public static void main(String[] args) {
    Calc calc = new Calc();
    ExceptionApp2 app = new ExceptionApp2();
    app.calculation11(calc);
//    app.calculation1(calc);
  }

}

package lesson03.testing;

public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  /**
   * for this methods at least THREE tests should be written
   * each branch, each "return" statement must be covered by a separate test
   */
  public int div(int a, int b) {
    if (b == 0) {
      return 1;
    } else {
      if (b %2 == 0) {
        return 2;
      } else {
        return 3;
      }
    }
  }

}

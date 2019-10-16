package lesson03;

import lesson02.Max2;

public class TypeWrappers2 {
  public static void main(String[] args) {
    int x = 5;
    Integer y = 6;

    Max2 max_ref = new Max2(5, 7);
    int max1 = max_ref.max();
    int max2 = Math.max(5, 7);

    int m1 = Integer.MIN_VALUE;
    int m2 = Integer.MAX_VALUE;

    int f = 1;
    Integer i4; // null
    String s = null;


  }
}

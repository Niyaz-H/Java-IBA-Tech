package lesson10;

public class IntoToBinary {
  public static void main(String[] args) {
    int[] masks = {
        0b10000000, // 0
        0b01000000,
        0b00100000,
        0b00010000,
        0b00001000,
        0b00000100,
        0b00000010,
        0b00000001  // 7
    };

    final int origin = 73;
    for (int i = 8; i>0; i--) {

      int mask =
//          0b1 << (i-1); // 00001000 1 on i-th position
      masks[8-i];
      boolean cond =
//          (origin>>(i-1) & 0b1)
          (  origin & (mask)  )>>(i-1)
              > 0;
      System.out.print(cond ? 1 : 0);
    }
  }
}

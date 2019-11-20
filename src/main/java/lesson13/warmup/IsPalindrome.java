package lesson13.warmup;

public class IsPalindrome {
  public boolean check(long number) {
    byte[] digits = new byte[20];
    int count = 0;
    while (number > 0) {
      digits[count++] = (byte)(number % 10);
      number /= 10;
    }
    for (int i = 0; i < count / 2; i++) {
      if (digits[count-i-1] != digits[i]) return false;
    }
    return true;
  }
}

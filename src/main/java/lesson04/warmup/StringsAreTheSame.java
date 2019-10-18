package lesson04.warmup;

public class StringsAreTheSame {
  String a;
  String b;

  /**
   * you have to implement your ONW implementation
   * to compare strings
   *
   * you are allowed to use only:
   * - String.length
   * - String.charAt
   * - any operations with primitives
   *
   */

  public boolean check(String one, String two) {
    if (one == null) {
      return false;
    }
    if (two == null) return false;

    if (one.length() != two.length()) return false;

    for (int i = 0; i < one.length(); i++) {
      if (one.charAt(i) != two.charAt(i)) {
        return false;
      }
    }
    return true;
//    throw new IllegalArgumentException("must be implemented to pass the tests");
  }
}

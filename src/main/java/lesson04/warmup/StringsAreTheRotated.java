package lesson04.warmup;

public class StringsAreTheRotated {

  public boolean check(String one, String two) {
    return one.concat(one).contains(two);
    //throw new IllegalArgumentException("must be implemented to pass the tests");
  }

}

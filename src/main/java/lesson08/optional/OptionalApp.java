package lesson08.optional;

import lesson08.warmup.Summarizer;

import java.util.Optional;

public class OptionalApp {
  public static void main(String[] args) {
    Summarizer s = new Summarizer();
    Optional<Integer> o1 = s.convertToInt("123");
    Optional<Integer> o2 = s.convertToInt("mdff435hgmg");
    String sh = "Hello";
    String nn = null;
    Optional<String> opt1 = Optional.ofNullable(sh);
    Optional<String> opt2 = Optional.ofNullable(nn);


    if (o1.isPresent()) {} // true
    Integer val = o1.get();

    if (o2.isPresent()) {} // false
    // o2.get(); // will brake
    int got = o2.orElse(0);
    int got2 = o2.orElseThrow(() -> new IllegalArgumentException("NO DATA"));
  }
}

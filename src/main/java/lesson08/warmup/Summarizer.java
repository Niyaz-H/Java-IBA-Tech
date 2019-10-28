package lesson08.warmup;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class Summarizer {

  boolean isNumber(String src) {
    try {
      Integer.parseInt(src);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  }

  int sum_v1(String origin) {
    if (origin == null) return 0;
    String[] items = origin.split(" ");
    int total = 0;
    for (String item: items) {
      if (isNumber(item)) {
        total += Integer.parseInt(item);
      }
    }
    return total;
  }

  public Optional<Integer> convertToInt(String src) {
    try {
      int val = Integer.parseInt(src);
      return Optional.of(val);
    } catch (NumberFormatException ex) {
      return Optional.empty();
    }
  }

  int sum_v2(String origin) {
    if (origin == null) return 0;
    String[] items = origin.split(" ");
    Optional<Integer> reduced = Stream.of(items) // Stream<String>
        .map(this::convertToInt)    // Stream<Optional<Integer>>
        .filter(Optional::isPresent) // Stream<Optional<Integer>>
        .map(Optional::get)         // Stream<Integer>
        .reduce(Integer::sum);      // Option<Integer>

//  preferred way
    return reduced.orElse(0);
//    way 2
//    return reduced.isPresent() ? reduced.get() : 0;

//    way 3
//    if (reduced.isPresent()) {
//      return reduced.get();
//    } else {
//      return 0;
//    }
  }

  int sum(String origin) {
    if (origin == null) return 0;
    String[] items = origin.split(" ");
    return Stream.of(items) // Stream<String>
        .map(this::convertToInt)    // Stream<Optional<Integer>>
        .flatMap(o -> o.map(Stream::of).orElseGet(Stream::empty))
        .reduce(Integer::sum)      // Option<Integer>
        .orElse(0);
  }

}

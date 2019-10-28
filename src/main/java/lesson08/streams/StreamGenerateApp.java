package lesson08.streams;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerateApp {
  public static void main1(String[] args) {
    Stream.generate(() -> Math.random()*100)
        .limit(10)
        .map(Double::intValue)
        .forEach(s-> System.out.println(s));
  }

  public static void main2(String[] args) {
    LinkedList<String> collect = "Hello World".chars()
        .boxed()
        .map(i -> String.format("*** %d ***", i))
        .collect(Collectors.toCollection(LinkedList::new));
  }

  public static void main3(String[] args) {
    String hello = "Hello World";
    IntStream.range(0, hello.length())
        .mapToObj(i -> hello.charAt(i))
        .collect(Collectors.toList());
  }

  public static void main4(String[] args) {
    Map<Integer, List<Integer>> collected = Stream.generate(() -> (int) (Math.random() * 40))
        .limit(20)
        .collect(Collectors.groupingBy(i -> i < 10 ? 1 : 2));
    System.out.println(collected);

  }
  public static void main(String[] args) {
    String collected = Stream.generate(() -> (int) (Math.random() * 40))
        .limit(20)
        .map(v -> v.toString())
//        .skip(2)
        .peek(el -> System.out.println(el))
        .collect(Collectors.joining(" * ", "<<", ">>"));
    System.out.println(collected);
  }
}

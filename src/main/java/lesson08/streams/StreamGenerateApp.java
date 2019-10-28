package lesson08.streams;

import java.util.LinkedList;
import java.util.List;
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

  public static void main(String[] args) {
    String hello = "Hello World";
    IntStream.range(0, hello.length())
        .mapToObj(i -> hello.charAt(i))
        .forEach(System.out::println);
  }
}

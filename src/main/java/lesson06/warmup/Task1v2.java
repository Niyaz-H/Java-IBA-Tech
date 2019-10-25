package lesson06.warmup;

import lesson03.equals.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1v2 {
  public static void main(String[] args) {
    ArrayList<Integer> data = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      data.add((int) (Math.random()*100));
    }
    Stream<Integer> stream = data.stream();
    Stream<Integer> stream2 = stream.filter(el -> el % 2 == 0);
    List<Integer> even = stream2.collect(Collectors.toList());
    int i;
    Stream<Pizza> pizzaStream = data.stream()
        .filter(el -> el % 2 != 0)
        .map(el -> new Pizza(el));
//        .filter(el -> el < 100)
    List<Pizza> odd = pizzaStream
        .collect(Collectors.toList());

    System.out.println(data.toString());
    System.out.println(odd);
    System.out.println(even);
  }
}

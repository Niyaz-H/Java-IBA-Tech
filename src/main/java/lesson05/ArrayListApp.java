package lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListApp {

  public static List<Integer> mult_by2(List<Integer> origin) {
    return origin.stream().map(x -> x * 2).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    ArrayList<Integer> ints = new ArrayList<Integer>() {{
      add(111);
      add(222);
      add(333);
    }};

    ArrayList<Integer> data = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      data.add((int) (Math.random()*20-10));
    }

    List<Integer> multiplied = mult_by2(data);

    data.indexOf(5);
    data.remove(5);
    data.remove((Integer) 5);
    data.add(5, 999);
    data.size();
    data.isEmpty();
    data.addAll(ints);



//    data.add(123);
//    data.add(56);
//    data.get(0); // 123
//    data.get(1); // 56
//    data.get(2); // Exception
    int size = data.size(); //2

    for (int item: data) {
      System.out.println(item);
    }

    Consumer<Integer> printer = new Consumer<Integer>() {
      @Override
      public void accept(Integer value) {
        System.out.println(value);
      }
    };
    data.forEach(printer);

    data.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer value) {
        System.out.println(value);
      }
    });
    data.forEach((Integer item) -> { System.out.println(item); });
    data.forEach(item -> { System.out.println(item); });
    data.forEach(item -> System.out.println(item));
    data.forEach(System.out::println);

    ArrayList<Integer> negatives = new ArrayList<>();
    data.forEach(item -> { if (item<0) negatives.add(item); });

    List<Integer> negatives2 = data
        .stream()
        .filter(item -> item < 0)
        .map(item -> item * 2)
        .filter(item -> item < 0)
        .distinct()
        .collect(Collectors.toList());

    List<Integer> positives2 = negatives.stream()
        .map(item -> item*(-1))
        .map(item -> item * 2)
        .collect(Collectors.toList());


    System.out.println(data);
    System.out.println(negatives);
    System.out.println(negatives2);
    System.out.println(positives2);

  }
}

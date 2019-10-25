package lesson06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;

public class ForEachApp {

  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("Scala");
    languages.add("C++");
    languages.add("Haskell");

    Consumer<String> my_consumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    };

    // step 0
    for (String s: languages) {
      System.out.println(s);
    }

    // step 1
    for (String s: languages) {
      my_consumer.accept(s);
    }

    // step 2
    languages.forEach(my_consumer);

    // step 3. anonymous class
    languages.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });

    // step 4
    languages.forEach((String s) -> {
      System.out.println(s);
    });

    // step 5
    languages.forEach(s -> {
      String s1 = s.toLowerCase();
      System.out.println(s1);
    });

    // step 6
    languages.forEach(s -> System.out.println(s));

    // step 7. method reference
    languages.forEach(System.out::println);

    // example. different action inside the lambda
    HashSet<String> a2 = new HashSet<>();
    languages.forEach(s -> a2.add(s));

  }

}

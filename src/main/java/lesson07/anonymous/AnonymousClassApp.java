package lesson07.anonymous;

import java.util.ArrayList;

public class AnonymousClassApp {

  public static void main(String[] args) {
    ArrayList<String> lang = new ArrayList<>();
    lang.add("Java");
    lang.add("Scala");
    lang.add("Haskell");
    lang.forEach(s -> System.out.println(s));
    System.out.println();

    ArrayList<String> lang2 = new ArrayList<String>() {{
      add("Java");
      add("Scala");
      add("Haskell");
      forEach(s -> System.out.println(s));
    }};
    System.out.println();

    System.out.println(lang.getClass().getName());
    System.out.println(lang2.getClass().getName());
  }

}

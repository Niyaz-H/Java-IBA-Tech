package lesson04.oop;

import java.util.ArrayList;

public class SortApp {
  public static void main(String[] args) {
    String s = "Hello, my dear friend.";
    ArrayList<Pair> pairs = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      pairs.add(new Pair(s.charAt(i), i));
    }
    pairs.forEach(p -> System.out.println(p));

  }
}

package lesson06;

import lesson03.equals.Pizza;

import java.util.HashSet;

public class HashcodeApp {
  public static void main(String[] args) {
    Pizza p1 = new Pizza(33);
    Pizza p2 = new Pizza(33);
    HashSet<Pizza> set = new HashSet<>();
    set.add(p1);
    set.add(p2);
    System.out.println(p1.equals(p2));
    System.out.println(set.size());

  }
}

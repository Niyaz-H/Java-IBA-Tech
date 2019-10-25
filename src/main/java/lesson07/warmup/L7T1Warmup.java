package lesson07.warmup;

import java.util.HashSet;

public class L7T1Warmup {

  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    while (set.size() < 20) {
      set.add((int) (Math.random()*21)-10);
    }
    System.out.println(set);
  }
}

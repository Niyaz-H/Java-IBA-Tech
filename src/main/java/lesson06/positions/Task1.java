package lesson06.positions;

import java.util.*;

public class Task1 {
  public static void main(String[] args) {
    final String origin = "'Hello, World!?";
    String lowered = origin.toLowerCase();

    StringBuilder sb = new StringBuilder();
    HashSet<Character> unique = new HashSet<>();

    for (int i = 0; i < lowered.length(); i++) {
      char realchar = lowered.charAt(i);
      if (Character.isLetter(realchar)) {
        sb.append(realchar);
        unique.add(realchar);
      }
    }

    String filtered = sb.toString();

    // for task 1
    HashMap<Character, Integer> map = new HashMap<>();
    // for task 2 (unused yet)
    HashMap<Character, List<Integer>> map2 = new HashMap<>();
    // for task 3 (unused yet)
    HashMap<Character, Item2> map3 = new HashMap<>();

    unique.forEach(letter -> map.put(letter, 0));

    for (int i = 0; i< filtered.length(); i++) {
      char c = filtered.charAt(i);
      int count = map.get(c);
      map.put(c, ++count);
    }

    System.out.println(map);
  }
}

package lesson06.warmip;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Task1 {
  public static void main(String[] args) {
    ArrayList<Integer> data = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
    ArrayList<Integer> even = new ArrayList<>();

    for (int i = 0; i < 100; i++) {
      data.add((int) (Math.random()*100));
    }

    for (int val: data) {
      if (val % 2 == 0) {
        odd.add(val);
      } else {
        even.add(val);
      }
    }

    System.out.println(data);
    System.out.println(odd);
    System.out.println(even);
  }
}

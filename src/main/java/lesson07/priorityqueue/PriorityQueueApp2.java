package lesson07.priorityqueue;

import lesson03.equals.Pizza;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueApp2 {
  static int random() {
    return (int) (Math.random()*20);
  }

  public static void main(String[] args) {

    Comparator<Pizza> pizza_comp = new Comparator<Pizza>() {
      @Override
      public int compare(Pizza one, Pizza two) {
        return one.size - two.size;
      }
    };

    PriorityQueue<Pizza> pq = new PriorityQueue<>((one, two) -> one.size - two.size);
    pq.add(new Pizza(33));
    pq.add(new Pizza(11));
    pq.add(new Pizza(66));
    pq.add(new Pizza(44));

    while (pq.size() > 0) {
      System.out.printf("%s, ", pq.poll().toString());
    }

  }
}

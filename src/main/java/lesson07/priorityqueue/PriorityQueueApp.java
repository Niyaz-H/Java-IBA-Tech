package lesson07.priorityqueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueApp {
  static int random() {
    return (int) (Math.random()*20);
  }

  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < 10; i++) {
      int n = random();
      a.add(n);
      pq.add(n);
    }
    System.out.println(a);
    System.out.println(pq);
    while (pq.size() > 0) {
      System.out.printf("%d, ", pq.poll());
    }



  }
}

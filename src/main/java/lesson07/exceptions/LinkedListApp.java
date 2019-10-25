package lesson07.exceptions;

import java.util.LinkedList;

public class LinkedListApp {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.addFirst(1); // returns void
    list.addLast(1);  // returns void
    list.offerFirst(1); // true/false
    list.offerLast(1);  // true/false
    list.peekFirst();     // takes, but doesn't remove
    list.peekLast();      // takes, but doesn't remove
    list.pollFirst();     // takes and removes or NULL
    list.pollLast();      // takes and removes or NULL
    list.removeFirst();   // takes and removes or EXCEPTION
    list.removeLast();    // takes and removes or EXCEPTION
  }
}

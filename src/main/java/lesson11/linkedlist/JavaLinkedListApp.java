package lesson11.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedListApp {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    Iterator<Integer> iterator = ll.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    Iterator<Integer> diterator = ll.descendingIterator();
    while (diterator.hasNext()) {
      System.out.println(diterator.next());
    }

  }
}

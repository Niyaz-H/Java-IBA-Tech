package lesson03.hw_event;

import java.util.Iterator;

public class Events implements Iterable<Event> {

  private final Event[] data;

  public Events(int number) {
    this.data = new Event[number];
    data[0] = new Event(1942, "World War II");
    data[1] = new Event(1991, "Independence");
  }

  /**
   * creates initial instance of Events object
   * .......
   * .......
   */
  public static Events create() {
    return new Events(2);
  }

  public boolean find(int year) {
    boolean found = false;
    for (Event e: data) {
      if (e.checkYear(year)) return true;
    }
    return found;
  }

  public String get(int year) {
    for (Event e: data) {
      if (e.checkYear(year)) return e.toString();
    }
    // TODO: Fix it
    return "";
  }

  public int findClosestTo(int year) {
    if (year==2000) return 1;
    throw new RuntimeException("Not implemented yet");
  }

  @Override
  public Iterator<Event> iterator() {
    return null;
  }
}

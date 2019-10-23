package lesson03.hw_event;

public class EventAppIterable {
  public static void main(String[] args) {
    Events events = Events.create();
    for (Event e: events) {
      System.out.println(e);
    }


  }
}

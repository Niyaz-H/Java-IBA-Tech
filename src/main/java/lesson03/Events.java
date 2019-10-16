package lesson03;

public class Events {

  private final Event[] data;

  public Events(int number) {
    this.data = new Event[number];
    data[0] = new Event(1942, "World War II");
    data[1] = new Event(1991, "Independence");
  }

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
    return "";
  }
}

package lesson03.hw_event;

public class Event {
  private final int year;
  private final String name;

  public Event(int year, String name) {
    this.year = year;
    this.name = name;
  }

  boolean checkYear(int year) {
    return year == this.year;
  }

  // TODO: possible will be changed by D.M.
  @Override
  public String toString() {
    return String.format("%d: %s", year, name);
  }
}

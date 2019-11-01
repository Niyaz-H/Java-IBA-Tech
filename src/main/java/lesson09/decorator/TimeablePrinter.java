package lesson09.decorator;

public class TimeablePrinter implements Printable {

  private final Printable origin;
  private long delta;

  public TimeablePrinter(Printable origin) {
    this.origin = origin;
  }

  @Override
  public void print() {
    long was = System.currentTimeMillis();
    origin.print();
    long now = System.currentTimeMillis();
    this.delta = now - was;
  }

  public long timeSpent() {
    return delta;
  }
}

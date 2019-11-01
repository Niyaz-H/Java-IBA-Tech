package lesson09.decorator;

public class PrinterApp {
  public static void main(String[] args) {
    Printable p2 = new TimeablePrinter(
        new BasePrinter("Hello"));

    Printable p3 = new FormattedPrinter2(p2);
    Printable p4 = new SpyPrinter(
        new FormattedPrinter(p3));

    p4.print();
    long delta = ((TimeablePrinter)p2).timeSpent();

  }
}

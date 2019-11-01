package lesson09.decorator;

public class FormattedPrinter implements Printable {

  private final Printable origin;

  public FormattedPrinter(Printable origin) {
    this.origin = origin;
  }

  @Override
  public void print() {
    System.out.println("---------------");
    origin.print();
    System.out.println("---------------");
  }
}

package lesson09.decorator;

public class FormattedPrinter2 implements Printable {

  private final Printable origin;

  public FormattedPrinter2(Printable origin) {
    this.origin = origin;
  }

  @Override
  public void print() {
    System.out.println("<<<<<<>>>>>>");
    origin.print();
    System.out.println("<<<<<<>>>>>>");
  }
}

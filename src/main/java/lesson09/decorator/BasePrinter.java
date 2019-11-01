package lesson09.decorator;

public class BasePrinter implements Printable {

  private final String data;

  public BasePrinter(String data) {
    this.data = data;
  }

  @Override
  public void print() {
    System.out.println(this.data);
  }
}

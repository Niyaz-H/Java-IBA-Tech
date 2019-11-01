package lesson09.decorator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SpyPrinter implements Printable {

  private final Printable origin;
  private final File file = new File("spy.txt");

  public SpyPrinter(Printable origin) {
    this.origin = origin;
  }

  @Override
  public void print() {
    try {
      BufferedWriter w = new BufferedWriter(new FileWriter(file));

      w.write("your activity is recording...\n");
      origin.print();
      w.write("your activity was recorded...\n");
      w.close();
    } catch (IOException e) { }
  }
}

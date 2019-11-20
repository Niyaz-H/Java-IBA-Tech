package lesson08.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOSimpleReadApp {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
        new FileReader(
            new File("data/_1234567890.txt")));
    String line;
    // way 1
    while (true) {
      line = br.readLine();
      if (line == null) break;
      System.out.println(line);
    }
    // way 2
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }

    br.close();
  }
}

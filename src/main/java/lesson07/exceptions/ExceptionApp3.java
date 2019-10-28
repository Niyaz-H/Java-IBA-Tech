package lesson07.exceptions;

import java.io.*;

public class ExceptionApp3 {
  public static void main(String[] args) {
    String s;
    try {
      BufferedReader br = new BufferedReader(new FileReader(new File("1.txt")));
      s = br.readLine();
    } catch (FileNotFoundException ex) {
      System.out.println("Smth went wrong during reading");
    } catch (IOException ex) {
      System.out.println("File not found");
    }
  }

}

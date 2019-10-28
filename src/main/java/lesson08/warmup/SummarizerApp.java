package lesson08.warmup;

import java.util.Scanner;

public class SummarizerApp {
  public static void main(String[] args) {
    Summarizer s = new Summarizer();
    Scanner in = new Scanner(System.in);
    String line = in.nextLine();
    int result = s.sum(line);
    System.out.printf("The sum is:%d\n", result);
  }
}

package lesson03;

import java.util.Scanner;

public class EventApp {
  public static void main(String[] args) {
    Events events = Events.create();
    Scanner in = new Scanner(System.in);
    while (true) {
      System.out.print("Enter the year:");
      int year = in.nextInt();
      boolean found = events.find(year);
      if (found) {
        System.out.println(events.get(year));
      } else {
        System.out.println("Please try again.");
      }
    }
  }
}

package lesson03.hw_event;

import java.util.Scanner;

public class EventApp {
  public static void main(String[] args) {
    Events events = Events.create();
    Scanner in = new Scanner(System.in);
    events.findClosestTo(2001);
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

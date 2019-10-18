package lesson04.oop_interfaces;

public class Human implements Thinkable {
  @Override
  public void think() {
    System.out.println("I'm human, I can think");
  }
}

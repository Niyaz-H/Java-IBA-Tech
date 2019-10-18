package lesson04.oop_interfaces;

public class Ford implements Driveable {
  @Override
  public void drive() {
    System.out.println("It's a Ford. It can drive");
  }
}

package lesson04.oop_interfaces;

public class Tesla implements Driveable, Thinkable {
  @Override
  public void drive() {
    System.out.println("It's a Tesla. It can drive");
  }

  @Override
  public void think() {
    System.out.println("It's a Tesla. It can think");
  }
}

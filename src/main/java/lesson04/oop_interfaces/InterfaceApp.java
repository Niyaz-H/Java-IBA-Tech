package lesson04.oop_interfaces;

public class InterfaceApp {
  public static void main(String[] args) {
    Human h = new Human();
    if (h instanceof Human) {
      // true
    }
    if (h instanceof Thinkable) {
      // true
    }
    Ford f = new Ford();
    if (f instanceof Ford) {
      // true
    }
    if (f instanceof Driveable) {
      // true
    }
    Tesla t = new Tesla();
    Driveable t1 = new Tesla();
    Thinkable t2 = new Tesla();
    if (t instanceof Tesla) {
      // true
    }
    if (t instanceof Driveable) {
      // true
    }
    if (t instanceof Thinkable) {
      // true
    }
    if (t instanceof Object) {
      // true
    }

    h.think();

    f.drive();

    t.drive();

    t.think();

    t1.drive();
    ((Tesla) t1).think();

    t2.think();
    ((Tesla) t2).drive();

  }
}

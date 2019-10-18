package lesson04.oop_abstract;

public abstract class AbstractFish {

  abstract void swim();

  public void do_smth() {
    System.out.println("***");
    swim();
    System.out.println("***");
  }

}

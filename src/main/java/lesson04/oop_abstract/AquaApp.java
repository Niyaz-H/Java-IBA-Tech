package lesson04.oop_abstract;

public class AquaApp {

  public int calculate(AbstractFish... fishes) {
    return 0;
  }

  public static void main(String[] args) {
//    new AbstractFish();
    AbstractFish f1 = new FishGood();
    AbstractFish f2 = new FishSmart();

//    f1.swim();
//    f2.swim();

    f1.do_smth();
    f2.do_smth();
  }
}

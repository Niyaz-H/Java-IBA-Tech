package lesson05.geometric;

public class RndFig {

  public static Figure value() {
    int x = Rnd.value(4);
    switch (x) {
      case 1: return new Circle();
      case 2: return new Rectangle();
      case 3: return new Triangle();
      case 4: return new Square();
    }
    throw new IllegalArgumentException("something went wrong ;(");
  }

}

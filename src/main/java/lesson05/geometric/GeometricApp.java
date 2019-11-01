package lesson05.geometric;

import java.util.ArrayList;

public class GeometricApp {

  public static void main(String[] args) {
    ArrayList<Figure> figures = new ArrayList<Figure>();
    for (int i = 0; i < 10; i++) {
      figures.add(RndFig.value());
    }
//    figures.add(new Circle());
//    figures.add(new Rectangle());
//    figures.add(new Square());
//    figures.add(new Triangle());
    int[] total = {0};
    figures.forEach(f -> total[0] += f.area());

    Circle c1 = new Circle(new Point(1, 1), 7);
    Circle c2 = new Circle(new Point(1,1), 7);
    if (c1.equals(c2)) {

    }

    System.out.printf("Total square is:%d\n", total[0]);
  }
}

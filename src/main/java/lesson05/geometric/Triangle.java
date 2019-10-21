package lesson05.geometric;

public class Triangle extends Figure {
  private final Point p1;
  private final Point p2;
  private final Point p3;

  public Triangle() {
    this(new Point(), new Point(), new Point());
  }

  public Triangle(Point p1, Point p2, Point p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  @Override
  public int area() {
    return 40;
  }
}

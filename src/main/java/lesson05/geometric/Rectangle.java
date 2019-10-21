package lesson05.geometric;

public class Rectangle extends Figure {
  private final Point p1;
  private final Point p2;

  public Rectangle() {
    this(new Point(), new Point());
  }

  public Rectangle(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  @Override
  public int area() {
    int len1 = Math.abs(p1.getX() - p2.getX());
    int len2 = Math.abs(p1.getY() - p2.getY());
    return len1 * len2;
  }
}

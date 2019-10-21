package lesson05.geometric;

public class Point {
  private final int x;
  private final int y;

  public Point() {
    this(Rnd.value(), Rnd.value());
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Point point = (Point) o;

    if (x != point.x) return false;
    return y == point.y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}

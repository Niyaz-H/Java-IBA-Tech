package lesson05.warmup.task2;

public class Rectangle extends Figure {
    private final Point x;
    private final Point y;

    public Rectangle(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int area() {
        return 0;
    }
}

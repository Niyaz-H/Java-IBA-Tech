package lesson05.warmup.task2;

public class Circle extends Figure {
    private final Point center;
    private final int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public int area() {
        return 0;
    }
}

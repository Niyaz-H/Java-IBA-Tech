package lesson05.warmup.task2;
import java.util.Random;

public class Point {
    private final int x, y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

//    public Point (){
//        this(
//            Rnd.value(),
//            Rnd.value()
//        );
//    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

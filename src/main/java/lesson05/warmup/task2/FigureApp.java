package lesson05.warmup.task2;

import java.util.ArrayList;

public class FigureApp {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            figures.add(new Square());
//        }
//        for (int i = 0; i < 3; i++) {
//            figures.add(new Rectangle());
//        }
//        for (int i = 0; i < 3; i++) {
//            figures.add(new Circle());
//        }
        for (int i = 0; i < 3; i++) {
            figures.add(new Triangle());
        }
    }

}

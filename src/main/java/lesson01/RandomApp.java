package lesson01;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        // one double value from the range [0..1)
        double rnd1 = Math.random();
        System.out.println(rnd1);

        // many values
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int rnd2 = random.nextInt();
            System.out.println(rnd2);
        }

        // many values from range [0, N)
        for (int i = 0; i < 10; i++) {
            int rnd2 = random.nextInt(5);
            System.out.println(rnd2);
        }

    }
}

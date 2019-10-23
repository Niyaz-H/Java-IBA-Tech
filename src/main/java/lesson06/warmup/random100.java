package lesson06.warmup;

import java.util.ArrayList;
import java.util.Random;

public class random100 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            array.add(r.nextInt(100));
            if (array.get(i) % 2 != 0) odd.add(array.get(i));
            else even.add(array.get(i));
        }

        System.out.println("Array:");
        for (Integer num : array) {
            System.out.print(num+" ");
        }
        System.out.println("\nOdds:");
        for (Integer num : odd) {
            System.out.print(num+" ");
        }
        System.out.println("\nEvens:");
        for (Integer num : even) {
            System.out.print(num+" ");
        }
        System.out.println("\n---------");
    }
}

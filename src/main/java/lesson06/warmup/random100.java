package lesson06.warmup;

import java.util.ArrayList;

public class random100 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            array.add((int)(Math.random()*100));
        }

        array.forEach(elem -> {
            if (elem % 2 != 0) odd.add(elem);
            else even.add(elem);
        });

        System.out.printf("Array:\n %s\n",array);
        System.out.printf("Odds:\n %s\n",odd);
        System.out.printf("Even:\n %s\n",even);
    }
}

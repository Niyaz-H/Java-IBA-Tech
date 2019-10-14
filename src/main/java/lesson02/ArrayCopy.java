package lesson02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        // empty array declaration
        int[] a = new int[10];

        // filling with random values
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*10+1);
        }

        // copying way #1
        int[] b = a.clone();

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int[] c = new int[10];

        // copying way #2
        System.arraycopy(a, 0, c, 0, 5);
        System.out.println(Arrays.toString(c));
    }
}

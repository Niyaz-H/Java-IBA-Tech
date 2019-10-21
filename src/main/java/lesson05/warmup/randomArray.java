package lesson05.warmup;

import java.util.Random;

public class randomArray {
    public static void main(String[] args) {
        int[] a = new int[20];
        int len = a.length;
        Random random = new Random();

        for (int i = 0; i < len; i++) {
            a[i] = random.nextInt(10);
            System.out.printf("%d. num "+a[i]+" is ",i+1);
            if (a[i]%2==0 && a[i]%3==0) System.out.println("fizzbuzz");
                else if (a[i]%2==0) System.out.println("fizz");
                    else if (a[i]%3==0) System.out.println("buzz");
                        else System.out.println("\"\"");
        }
    }
}

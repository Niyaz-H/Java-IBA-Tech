package lesson02;

import java.util.Random;

public class TwoDimArray99 {
    public static void main(String[] args) {

        int[][] a = {{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}};

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = random.nextInt(5+5)-5;
                System.out.print(a[i][j]+" ");
            }
            System.out.print("  ");
        }
        System.out.println("");

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (a[i][j]<0) {
//                    System.out.println(a[i][j] + " is negative");
//                } else if (a[i][j]>0){
//                    System.out.println(a[i][j] + " is positive");
//                } else {
//                    System.out.println(a[i][j] + " is null");
//                }
//            }
//            System.out.println("");
//        }
        System.out.println("Negative Matrix:");
        for (int i = 0; i < 5; i++) {
            System.out.print("[");
            for (int j = 0; j < 5; j++) {
                if (a[i][j]<0){
                    System.out.print(" "+a[i][j]+" ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("]\n");
        }

        System.out.println("Non-negative Matrix:");
        for (int i = 0; i < 5; i++) {
            System.out.print("[");
            for (int j = 0; j < 5; j++) {
                if (a[i][j]>=0){
                    System.out.print(" "+a[i][j]+" ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("]");
        }
    }
}

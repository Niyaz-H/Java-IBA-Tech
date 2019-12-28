package lesson01;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        int i, j, space;
        int n = 5;
        space = n - 1;
        for (j = 1; j <= n; j++){
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2*j - 1; i++) {
                System.out.print("*");
            }
            System.out.println(' ');
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) {
            for (i = 1; i <= space; i++){
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2*(n - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

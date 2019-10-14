package lesson01;

public class Scope {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        i = 11; // isn't available here because closed curly brace

        int k = 5;
        if (k == 5) {
            int zz= 777;
        }
//        zz = 888; //  // isn't available here because closed curly brace
    }
}

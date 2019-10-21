package lesson03;

import java.util.Random;

public class RandomLetters {
    public static void main(String[] args) {
        String s10 = generate(5);
        System.out.println(s10);
    }

    private static String generate(int i) {
        Random random = new Random();
        String word = "";
        for (int j = 0; j < i; j++) {
            word += (char)random.nextInt('Z'-'A'+1);
        }
        return word;
    }
}

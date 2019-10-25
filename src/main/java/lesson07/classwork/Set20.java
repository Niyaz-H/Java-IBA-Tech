package lesson07.classwork;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Set20 {
    public static void main(String[] args) {
        Set<Long> set = new HashSet<Long>(20);
        Random random = new Random();

        while (set.size()!=20){
            while (!set.add((long)random.nextInt(20) - 10));
        }

        System.out.println(set);
    }
}

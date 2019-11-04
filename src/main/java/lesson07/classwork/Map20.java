package lesson07.classwork;

import java.util.HashMap;

public class Map20 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        int k = 1;
        Map20 app = new Map20();

        while (map.size() < 20) {
            map.put(k++, app.randomstring(10,30));
        }
        System.out.println(map);
    }

    private String randomstring(int min, int max){
        int len = (int )(Math.random()*(max - min + 1))+min;
        String outcome = "";

        while (outcome.length()<len)
            outcome = outcome + (char)(Math.random()*('z'-'a'+1)+'a');
        return outcome;
    }
}

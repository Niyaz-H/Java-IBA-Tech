package lesson07.classwork;
import java.lang.String;

public class StrTransform {
    public static void main(String[] args) {
        String transform = new String();
        String s1 = transform("123");
        String s2 = transform("abc");

        int k = Integer.parseInt(s2);

        System.out.println(k);
    }

    private static String transform(String s) {
        return s;
    }
}

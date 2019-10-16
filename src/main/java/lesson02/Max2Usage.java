package lesson02;

public class Max2Usage {
    public static void main(String[] args) {
        Max2 max_class = new Max2(5, 7);
        max_class.max();
        System.out.println(max_class);

        String a = "Alex";
        String b = "A"+"LEX".toLowerCase();
        if (a == b) {
            System.out.println("They are equal");
        } else {
            System.out.println("They aren't equal");
        }
        if (a.equals(b)) {
            System.out.println("FINALLY. They are equal");
        } else {
            System.out.println("They aren't equal");
        }



    }
}

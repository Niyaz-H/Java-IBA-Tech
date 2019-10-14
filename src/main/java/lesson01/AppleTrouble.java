package lesson01;

public class AppleTrouble {
    public static void main(String[] args) {
        // problem
        System.out.println("Apple "+
                "costs " +
                + '2'
                + " USD");

        // solution #1
        System.out.printf("Apple costs %d USD\n", 2);

        // solution #2
        int price = 2;
        System.out.printf("Apple costs %d USD\n", price);
    }
}

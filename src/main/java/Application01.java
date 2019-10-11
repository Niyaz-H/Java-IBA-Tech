

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Where are you from? ");

        String city = s.nextLine();

        System.out.printf("Hello from %s!", city);
    }

}

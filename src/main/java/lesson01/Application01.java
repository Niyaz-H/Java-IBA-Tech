package lesson01;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        // create an instance of Scanner class for further usage it
        Scanner s = new Scanner(System.in);
        // print line to system standard output device (console)
        System.out.print("Where are you from? ");
        // wait for user input from the console
        String city = s.nextLine();
        // print formatted output to the console
        System.out.printf("Hello from %s!", city);
    }
}

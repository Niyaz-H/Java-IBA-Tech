package lesson02;

public class ArityApp {
    // operator arity;
    // prefix / postfix notation
    // unary
    // binary
    // ternary
    public static void main(String[] args) {
        int a = 5 + 7; // binary
        boolean isEligigle = ! false; // unary, prefix
        int z=6;
        z++; // unary, postfix
        String s;

        if (z > 5) {
            s = "More than FIVE";
        } else {
            s = "Less tan FIVE";
        }

        s = z > 5 ? "More than FIVE" : "Less tan FIVE";

//        z = 11;
        s = z > 10 ? "More then TEN" :
                z > 9 ? "More than 9" :
                        z > 8 ? "More than 8" : "smth ELSE";


    }
}

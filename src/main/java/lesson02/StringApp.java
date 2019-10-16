package lesson02;

public class StringApp {
    public static void main(String[] args) {
        String name1 = new String("Dima");
        final String name2 = "Alex";
//        name2 = "Sergo";
        name2.toUpperCase();
        name2.toLowerCase();
        name2.length();
        name2.substring(1,2);
        String replaced = name2.replace('A', 'B');
        name2.startsWith("Al");
        name2.endsWith("zz"); // false
        char charAt = name2.charAt(2); // 'e'
        "POST".compareToIgnoreCase("Post"); // true
        name2.contains("le"); // true
        name2.indexOf('e'); // 2
        name2.isEmpty();
        "ABBA".lastIndexOf("A"); // 3
        String[] ss = "Hallo My Dear Friend".split(" ");
        int length = ss.length;//
        String simpleName = name2.getClass().getSimpleName(); // String




    }
}

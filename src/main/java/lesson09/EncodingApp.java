package lesson09;

public class EncodingApp {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Привет";
    String s3 = "Əliyev";
    System.out.println(s1.length()); // 5
    System.out.println(s2.length()); // 6
    System.out.println(s3.length()); // 6
    byte[] bytes1 = s1.getBytes();
    byte[] bytes2 = s2.getBytes();
    byte[] bytes3 = s3.getBytes();
    System.out.println(bytes1.length); // 5
    System.out.println(bytes2.length); // 12
    System.out.println(bytes3.length); // 7

    for (byte b: bytes2) {
      System.out.printf("%x ",b);
    }

    System.out.println();
    for (byte b: bytes3) {
      System.out.printf("%x ",b);
    }

  }
}

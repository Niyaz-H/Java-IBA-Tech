package lesson04;

public class Trick {

  public static void print() {
    System.out.println("Hello World");
  }

  public static void main(String[] args) {
    ((Trick)null).print();
    Trick.print();
    print();
  }
}

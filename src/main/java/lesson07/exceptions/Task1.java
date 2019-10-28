package lesson07.exceptions;

public class Task1 {
  String transform(String origin) {
    try {
      Integer.parseInt(origin);
      return origin;
    } catch (NumberFormatException ex) {
      return "<WRONG>";
    }
  }

  public static void main(String[] args) {
    Task1 app = new Task1();
    System.out.println(app.transform("123"));
    System.out.println(app.transform("123Z"));
  }
}

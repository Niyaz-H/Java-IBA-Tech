package lesson13.warmup;

public class ChangeTheCase {
  String invert(String origin) {
    byte[] bytes = origin.getBytes();
    for (int i = 0; i < bytes.length; i++) {
      bytes[i]^=1<<5;
    }
    return new String(bytes);
  }
}

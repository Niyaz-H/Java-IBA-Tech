package lesson04.oop;

public class Pair {
  Character c;
  Integer pos;

  public Pair(Character c, Integer pos) {
    this.c = c;
    this.pos = pos;
  }

  public Character c() {
    return c;
  }

  public Integer pos() {
    return pos;
  }

  @Override
  public String toString() {
//    String s = "<"+ c + ", " + pos + ">";
    return String.format("<%s, %d>", c, pos);
  }
}

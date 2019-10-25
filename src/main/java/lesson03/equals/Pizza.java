package lesson03.equals;

public class Pizza {
  int size;
  String name;

  public Pizza(int size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object that) {
    if (this == that) return true;
    if (!(that instanceof Pizza)) return false;
    Pizza thatPizza = (Pizza) that;
    if (this.size == thatPizza.size) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
//    return size*31 + name.hashCode();
    return size;
  }
}

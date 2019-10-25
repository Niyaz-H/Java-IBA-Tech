package lesson06.equals;

public class PizzaEq {
  final int size;

  public PizzaEq(int size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object that) {
    if (this == that) return true;
    if (!(that instanceof PizzaEq)) return false;
    PizzaEq thatPizza = (PizzaEq) that;
    if (this.size == thatPizza.size) {
      return true;
    } else {
      return false;
    }
  }
}

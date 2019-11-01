package lesson09.dao;

public class Pizza {
  private final int id;
  private final String name;
  private final int size;
  private final int cost;

  public Pizza(int id, String name, int size, int cost) {
    this.id = id;
    this.name = name;
    this.size = size;
    this.cost = cost;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }

  public int getCost() {
    return cost;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Pizza{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", size=" + size +
        ", cost=" + cost +
        '}';
  }
}

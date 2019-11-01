package lesson09.dao;

public class Cake {
  private final int id;
  private final String name;
  private final int price;

  public Cake(int id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Cake{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}

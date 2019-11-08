package lesson11;

public class XHashMap {
  private Integer[] data = new Integer[10];

  public int get(int key) {
    return data[key % 10];
  }

  public void put(int key, int value) {
    data[key % 10] = value;
  }

  public static void main(String[] args) {
    XHashMap xm = new XHashMap();
    xm.put(101, 500);
    xm.put(205, 600);
    // problem
    xm.put(305, 601);
  }

}

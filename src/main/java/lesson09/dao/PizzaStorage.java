package lesson09.dao;


import java.util.ArrayList;
import java.util.List;

public class PizzaStorage {
  private final List<Pizza> st = new ArrayList();

  public void put(Pizza p) {
    st.add(p);
  }

  public Pizza get(String name) {
    for (Pizza p: st) {
      if (p.getName().equals(name)) return p;
    }
    throw new IllegalArgumentException("there is no pizza with req. name");
  }


}

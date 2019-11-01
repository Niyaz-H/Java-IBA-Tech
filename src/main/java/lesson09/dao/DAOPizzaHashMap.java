package lesson09.dao;

import java.util.HashMap;
import java.util.Map;

public class DAOPizzaHashMap implements DAO<Pizza> {

  private final Map<Integer, Pizza> storage = new HashMap<>();

  @Override
  public void store(Pizza data) {
    storage.put(data.getId(), data);
  }

  @Override
  public Pizza get(int id) {
    return storage.get(id);
  }

  @Override
  public void delete(int id) {
    storage.remove(id);
  }

  @Override
  public void update(Pizza data) {
    storage.put(data.getId(), data);
  }
}

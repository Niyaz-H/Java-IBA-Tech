package lesson09.dao;

import java.util.HashMap;
import java.util.Map;

public class DAOPersonHashMap implements DAO<Person> {

  private final Map<Integer, Person> storage = new HashMap<>();

  @Override
  public void store(Person data) {
    storage.put(data.getId(), data);
  }

  @Override
  public Person get(int id) {
    return storage.get(id);
  }

  @Override
  public void delete(int id) {
    storage.remove(id);
  }

  @Override
  public void update(Person data) {
    storage.put(data.getId(), data);
  }
}

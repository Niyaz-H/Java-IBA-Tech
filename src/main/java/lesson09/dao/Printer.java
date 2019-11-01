package lesson09.dao;

public class Printer {
  public void printAllPizzas(DAO<Pizza> storage) {
    storage.get(1);
    //...
    //...
  }

  public void printAllPersons(DAO<Person> storage) {
    storage.get(1);
    //...
    //...
  }
}

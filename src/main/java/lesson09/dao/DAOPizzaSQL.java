package lesson09.dao;

public class DAOPizzaSQL implements DAO<Pizza> {
  @Override
  public void store(Pizza data) {
    System.out.println("DAOPizzaSQL.store");
  }

  @Override
  public Pizza get(int id) {
    System.out.println("DAOPizzaSQL.get");
    return null;
  }

  @Override
  public void delete(int id) {
    System.out.println("DAOPizzaSQL.delete");
  }

  @Override
  public void update(Pizza data) {
    System.out.println("DAOPizzaSQL.data");
  }
}

package lesson09.dao;

public class DAOPersonSQL implements DAO<Person> {
  @Override
  public void store(Person data) {
    System.out.println("DAOPersonSQL.store");
  }

  @Override
  public Person get(int id) {
    System.out.println("DAOPersonSQL.get");
    return null;
  }

  @Override
  public void delete(int id) {
    System.out.println("DAOPersonSQL.delete");
  }

  @Override
  public void update(Person data) {
    System.out.println("DAOPersonSQL.data");
  }
}

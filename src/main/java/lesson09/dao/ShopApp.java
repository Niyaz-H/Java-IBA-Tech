package lesson09.dao;

public class ShopApp {

  public static void main(String[] args) {
    Person person1 = new Person(1, "Alex", 33);
    Person person2 = new Person(2, "Dim", 44);
    Pizza pizza1 = new Pizza(11, "Margarita", 67, 100);
    Pizza pizza2 = new Pizza(12, "Quattro formaggio", 33, 70);

    DAO<Person> daoPerson =
//        new DAOPersonHashMap();
        new DAOPersonSQL();
    DAO<Pizza> daoPizza =
//        new DAOPizzaHashMap();
        new DAOPizzaSQL();

    daoPerson.store(person1);
    daoPerson.store(person2);

    daoPizza.store(pizza1);
    daoPizza.store(pizza2);

    Person person_got1 = daoPerson.get(1);
    Person person_got2 = daoPerson.get(2);

    Pizza pizza_got1 = daoPizza.get(11);
    Pizza pizza_got2 = daoPizza.get(12);

    Printer p = new Printer();
    p.printAllPersons(daoPerson);
    p.printAllPizzas(daoPizza);
  }
}

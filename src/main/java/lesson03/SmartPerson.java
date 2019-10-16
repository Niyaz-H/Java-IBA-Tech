package lesson03;

public class SmartPerson extends Person {

  boolean isSmart() {
    this.name = this.name.toUpperCase();
    return true;
  }
}

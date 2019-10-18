package lesson04.oop_composition;

public class Shelf {
  int house;
  int floor;
  int room;
  int maxsize;

  Book[] books;
  int index = 0;

  public Shelf(int house, int floor, int room, int maxsize) {
    this.house = house;
    this.floor = floor;
    this.room = room;
    this.maxsize = maxsize;
    this.books = new Book[this.maxsize];
  }

  public void addBook(Book book) {
    if (index >= maxsize) {
      throw new IllegalArgumentException("there is no space in tis shelf");
    }
    books[index++] = book;
  }

  public boolean contains(String name) {
    for (int i = 0; i < index; i++) {
      if (books[i].name.equals(name)) return true;
    }
    return false;
  }
}

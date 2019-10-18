package lesson04.generics;

import lesson03.hw_event.Event;
import lesson04.oop_abstract.AbstractFish;
import lesson04.oop_abstract.FishGood;
import lesson04.oop_abstract.FishSmart;
import lesson04.oop_composition.Author;
import lesson04.oop_composition.Book;

import java.util.ArrayList;

public class GenericsApp {
  static int[] data_i = {} ;
  static String[] data_s = {};

  public static int get_i(int index) {
    return data_i[index];
  }

  public static String get_s(int index) {
    return data_s[index];
  }

  public static void main(String[] args) {
//    int i = data_i[0];
//    String s = data_s[0];

    ArrayList<Integer> ai = new ArrayList<>();
    ai.add(1111);
    ai.add(2222);
//    ai.add("aa");
//    ai.add(true);
    ai.get(0);
    ai.get(1);

    ArrayList<String> as = new ArrayList<>();
    as.add("hello");
    as.add("world");
//    as.add(2.5);

//    new ArrayList<Event>()
//    new ArrayList<Book>()
//    new ArrayList<Author>()
    ArrayList<AbstractFish> af = new ArrayList<>();
    af.add(new FishGood());
    af.add(new FishSmart());

    // 1
    for (AbstractFish a: af) {
      a.do_smth();
    }
    // 2
    af.forEach((AbstractFish a) -> a.do_smth());
    // 3
    af.forEach(a -> a.do_smth());
    // 4
    af.forEach(AbstractFish::do_smth);





  }
}

package lesson06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachApp {

  public ArrayList<String> data1() {
    ArrayList<String> a = new ArrayList<String>();
    a.add("Java");
    a.add("Scala");
    a.add("C++");
    a.add("Haskell");
    return a;
  }

  public ArrayList<String> data2() {
    return new ArrayList<String>() {{
      add("Java");
      add("Scala");
      add("C++");
      add("Haskell");
    }};
  }

  public List<String> data3() {
    return Arrays.asList("Java", "Scala", "C++", "Haskell");
  }

  public static void main(String[] args) {
    ForEachApp app = new ForEachApp();
    ArrayList<String> data = app.data1();

    data.forEach(s -> System.out.println(s));

    for (String s: data) {
      System.out.println(s);
    }

    Iterator<String> it = data.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }


  }
}

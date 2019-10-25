package lesson07.anonymous;

import java.util.ArrayList;
import java.util.List;

public class AnonymousRealApp1 {

  /**
   * here we process our data
   */
  public void process(List<String> items) {
    items.forEach(s -> System.out.printf("<%s>\n", s));
  }

  public static void main(String[] args) {
    AnonymousRealApp1 app = new AnonymousRealApp1();

    ArrayList<String> lang = new ArrayList<>();
    lang.add("Java");
    lang.add("Scala");
    lang.add("Haskell");
    app.process(lang);

    System.out.println();

    app.process(new ArrayList<String>() {{
      add("Java");
      add("Scala");
      add("Haskell");
    }});

  }

}

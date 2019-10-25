package lesson07.anonymous;

import java.util.ArrayList;
import java.util.List;

public class AnonymousRealApp2 {

  public List<String> generate_data1() {
    ArrayList<String> lang = new ArrayList<>();
    lang.add("Java");
    lang.add("Scala");
    lang.add("Haskell");
    return lang;
  }

  public List<String> generate_data2() {
    return new ArrayList<String>() {{
      add("Java");
      add("Scala");
      add("Haskell");
    }};
  }

  public static void main(String[] args) {
    AnonymousRealApp2 app = new AnonymousRealApp2();

    app.generate_data1().forEach(s -> System.out.printf("<<%s>>\n",s));
    System.out.println();
    app.generate_data2().forEach(s -> System.out.printf(">>%s<<\n",s));
  }

}

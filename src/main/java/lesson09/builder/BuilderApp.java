package lesson09.builder;

public class BuilderApp {
  public static void main(String[] args) {
    Complicated complicated1 = new Complicated(1, 2, 3, 4, 5, 6, 7);
    Complicated complicated2 = new ComplicatedBuilder()
        .withId(1)
        .withName(2)
        .withOwner(3)
        .withIdea(4)
        .withResponsibility(5)
//        .withParent(6)
//        .withExtra(7)
        .build();
  }
}

package lesson09.builder;


public class ComplicatedBuilder {
  private int f1;
  private int f2;
  private int f3;
  private int f4;
  private int f5;
  private int f6;
  private int f7;

  public ComplicatedBuilder withId(int i) {
    f1 = i;
    return this;
  }

  public ComplicatedBuilder withName(int i) {
    f2 = i;
    return this;
  }

  public ComplicatedBuilder withOwner(int i) {
    f3 = i;
    return this;
  }

  public ComplicatedBuilder withIdea(int i) {
    f4 = i;
    return this;
  }

  public ComplicatedBuilder withResponsibility(int i) {
    f5 = i;
    return this;
  }

  public ComplicatedBuilder withParent(int i) {
    f6 = i;
    return this;
  }

  public ComplicatedBuilder withExtra(int i) {
    f7 = i;
    return null;
  }

  public Complicated build() {
    return new Complicated(f1,f2,f3,f4,f5,f6,f7);
  }
}

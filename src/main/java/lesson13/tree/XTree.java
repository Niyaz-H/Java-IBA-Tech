package lesson13.tree;

public class XTree {

  class XItem {
    int value;
    XItem left;
    XItem right;

    public XItem(int value) {
      this.value = value;
    }

    public XItem(int value, XItem left, XItem right) {
      this.value = value;
      this.left = left;
      this.right = right;
    }

    @Override
    public String toString() {
      return String.format("v:%d l:%s r:%s", value,
          left == null ? "null" : "has",
          right == null ? "null" : "has");
    }
  }

  private XItem root;

  public XTree() {
    throw new IllegalArgumentException("not implem yet");
  }

  public void add(int val) {
    throw new IllegalArgumentException("add:not implem yet");
  }

  public boolean contains(int val) {
    throw new IllegalArgumentException("contains:not implem yet");
  }

  public void remove(int val) {
    throw new IllegalArgumentException("remove:not implem yet");
  }

}

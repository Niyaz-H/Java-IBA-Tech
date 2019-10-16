package lesson02;

public class IntegerContainer {

    private int value;

    public IntegerContainer(int value) {
        this.value = value;
    }

    public int get() {
        return this.value;
    }

    public void set(int newVal) {
        this.value = newVal;
    }
}

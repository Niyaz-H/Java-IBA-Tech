package lesson02;

public class Max2 {
    private final int val1;
    private final int val2;

    public Max2(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public int max() {
        return Math.max(val1, val2);
    }

    @Override
    public String toString() {
        return String.format("Max2{val1=%d, val2=%d}", val1, val2);
    }

}

package lesson02;

public class ParametersPassing {

    static void swapV(int x, int y) {
        int z = x;
        x = y;
        y = z;
    }

    static void swap(int[] x, int[] y) {
        int z = x[0];
        x[0] = y[0];
        y[0] = z;
    }

    static void swap3(IntegerContainer a,
                      IntegerContainer b) {
        int tmp = a.get();
        a.set(b.get());
        b.set(tmp);
    }

    // passing by value: (all primitives)

    // passing by reference (arrays and classes)


    public static void main(String[] args) {
        int c = 5;
        int d = 7;
        System.out.printf("a=%d, b=%d\n", c, d);
        swapV(c, d);
        System.out.printf("a=%d, b=%d\n", c, d);






        IntegerContainer c_ = new IntegerContainer(c);
        IntegerContainer d_ = new IntegerContainer(d);

        System.out.println("----------------");
        System.out.printf("a=%d, b=%d\n", c_.get(), d_.get());

        swap3(c_, d_);
        System.out.printf("a=%d, b=%d\n", c_.get(), d_.get());
        System.out.println("----------------");








        int[] a = {5};
        int[] b = {7};
        System.out.printf("a=%s, b=%s\n", a[0], b[0]);
        swap(a, b);
        System.out.printf("a=%s, b=%s\n", a[0], b[0]);
    }
}

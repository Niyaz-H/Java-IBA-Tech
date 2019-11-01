package lesson10;

public class BubbleSortApp {
  public static int[] generate() {
    return new int[]{1,77,4,88,5,2};
  }

  public static void print(int[] a) {
    for (int item: a) {
      System.out.print(item+" ");
    }
    System.out.println();
  }

  public static void sort(int[] data) {
    for (int i=0; i<data.length; i++) {
      for (int j=i+1; j<data.length; j++) {
        if (data[i]>data[j]) {
          int t = data[i];
          data[i] = data[j];
          data[j] = t;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] origin = generate();
    int[] sorted = origin.clone();
    sort(sorted);
    print(origin);
    print(sorted);
  }
}

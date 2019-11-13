package lesson13.binarysearch;

import lesson10.Utils;

import java.util.Arrays;

public class BinarySearchApp {
  public static void main(String[] args) {
    int[] data = Utils.create_random_data(30);
    int val = (int) (Math.random() * 100);
    Arrays.sort(data);
    Utils.printArray("data:", data);
    System.out.printf("val:%d\n", val);
    BinarySearch app = new BinarySearch();
    System.out.println(app.find(data, val));
    System.out.printf("counter:%d\n", app.counter);

  }
}

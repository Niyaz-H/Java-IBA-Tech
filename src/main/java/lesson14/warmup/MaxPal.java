package lesson14.warmup;

import lesson13.warmuo.IsPalindrome;
import lesson14.warmup.prime.versions.PrimesDynamic;

public class MaxPal {
  private final static int MIN = 10000;
  private final static int MAX = 99999;

  public static void main(String[] args) {
    IsPalindrome isPalindrome = new IsPalindrome();
    int[] primes = new PrimesDynamic(MIN, MAX).data();
    long max_product=0;
    long max_1=0;
    long max_2=0;
    for (int i = 0; i < primes.length; i++) {
      for (int j = primes.length-1; j >= 0 ; j--) {
        long product = ((long) primes[i])*primes[j];
        if (isPalindrome.check(product))
          if (product>max_product) {
            max_product = product;
            max_1 = primes[i];
            max_2 = primes[j];
            break;
          }
      }
    }
    System.out.println(max_1);
    System.out.println(max_2);
    System.out.println(max_product);
  }
}

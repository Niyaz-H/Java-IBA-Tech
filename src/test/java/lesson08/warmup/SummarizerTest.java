package lesson08.warmup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SummarizerTest {

  private Summarizer s;

  @Before
  public void before() {
    this.s = new Summarizer();
  }

  @Test
  public void sum1() {
    final String data = null;
    int result = s.sum(data);
    assertEquals(0, result);
  }

  @Test
  public void sum2() {
    final String data = "";
    int result = s.sum(data);
    assertEquals(0, result);
  }

  @Test
  public void sum3() {
    final String data = "vjhv hmbhj";
    int result = s.sum(data);
    assertEquals(0, result);
  }

  @Test
  public void sum4() {
    final String data = "1 2 3";
    int result = s.sum(data);
    assertEquals(6, result);
  }

  @Test
  public void sum5() {
    final String data = "-1 12 abc";
    int result = s.sum(data);
    assertEquals(11, result);
  }

  @Test
  public void sum6() {
    final String data = "-10 10 3 abtc";
    int result = s.sum(data);
    assertEquals(3, result);
  }
}

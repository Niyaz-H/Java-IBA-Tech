package lesson13.warmuo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPrimeTest {

  private IsPrime c;

  @Before
  public void setUp() throws Exception {
    this.c = new IsPrime();
  }

  @Test
  public void check1() {
    assertEquals(true, c.check(1));
  }

  @Test
  public void check2() {
    assertEquals(true, c.check(2));
  }

  @Test
  public void check3() {
    assertEquals(true, c.check(3));
  }

  @Test
  public void check4() {
    assertEquals(false, c.check(4));
  }

  @Test
  public void check5() {
    assertEquals(false, c.check(10));
  }

  @Test
  public void check6() {
    assertEquals(true, c.check(13));
  }
}

package lesson13.warmup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeTest {

  private IsPalindrome c;

  @Before
  public void setUp() throws Exception {
    this.c = new IsPalindrome();
  }

  @Test
  public void check1() {
    assertEquals(true, c.check(121));
  }

  @Test
  public void check2() {
    assertEquals(false, c.check(12345));
  }

  @Test
  public void check3() {
    assertEquals(true, c.check(12321));
  }

  @Test
  public void check4() {
    assertEquals(true, c.check(1));
  }

  @Test
  public void check5() {
    assertEquals(true, c.check(22));
  }
}

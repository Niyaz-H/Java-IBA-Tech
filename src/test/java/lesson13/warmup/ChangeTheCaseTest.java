package lesson13.warmup;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeTheCaseTest {

  private ChangeTheCase c;

  @Before
  public void setUp() throws Exception {
    this.c = new ChangeTheCase();
  }

  @Test
  public void invert1() {
    assertEquals("ABC", c.invert("abc"));
  }

  @Test
  public void invert2() {
    assertEquals("heLLo", c.invert("HEllO"));
  }

  @Test
  public void invert3() {
    assertEquals("Alex", c.invert("aLEX"));
  }
}

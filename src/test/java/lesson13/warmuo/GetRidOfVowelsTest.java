package lesson13.warmuo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetRidOfVowelsTest {

  private GetRidOfVowels c;

  @Before
  public void setUp() throws Exception {
    this.c = new GetRidOfVowels();
  }

  @Test
  public void filter1() {
    assertEquals("hll", c.filter("hello"));
  }

  @Test
  public void filter2() {
    assertEquals("Wrld Wr ", c.filter("World War II"));
  }
}

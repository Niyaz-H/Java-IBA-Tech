package lesson14;

import lesson15.RotateNegatives;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateNegativesTest {

  private RotateNegatives c;

  @Before
  public void setUp() throws Exception {
    this.c = new RotateNegatives();
  }

  @Test
  public void rotate() {
    int[] src =      {7,-6,1,2,-3,3,4,5,-1,6,7,-2,8,9,-3,8};
    int[] expected = {7,-3,1,2,-6,3,4,5,-3,6,7,-1,8,9,-2,8};
    int[] rotated  = c.rotate(src);
    assertArrayEquals(expected, rotated);
  }
}

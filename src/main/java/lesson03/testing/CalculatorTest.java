package lesson03.testing;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.*;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CalculatorTest {

  private Calculator c;

  @Before
  public void before() {
    this.c = new Calculator();
  }

  @Test
  public void add() {
    assertEquals(4, c.add(2,2));
  }

  @Test
  public void sub() {
    assertEquals(5, c.sub(6,1));
  }

  @Test
  public void div1() {
    assertEquals(1, c.div(7,0));
  }

  @Test
  public void div2() {
    assertEquals(2, c.div(8,2));
  }

  @Test
  public void div3() {
    assertEquals(3, c.div(9,1));
  }

  /**
   * how to implement customs checking
   */
  @Test
  public void check() {
    Calculator c = new Calculator();
    assertThat(c.add(4,6)).isEqualTo(10);
    assertThat(c.add(4,6)).matches(new Predicate<Integer>() {
      @Override
      public boolean test(Integer val) {
        /*
         * fell free to write any custom code here
         * to check the custom complicated checks
         */
        if (val != null && val >0 && val > 9 && val < 20) {
          return true;
        } else {
          return false;
        }
      }
    });
  }

}

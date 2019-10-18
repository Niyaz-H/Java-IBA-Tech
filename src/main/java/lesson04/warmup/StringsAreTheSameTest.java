package lesson04.warmup;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StringsAreTheSameTest {

  private Supplier<String> randomString = () ->
      Stream.generate(() -> (char) (Math.random()*('Z'-'A'+1)+'A')).limit((int)(Math.random()*10+10)).map(Object::toString).reduce(String::concat).get();

  private StringsAreTheSame core;

  @Before
  public void before() {
    this.core = new StringsAreTheSame();
  }

  @Test
  public void check_the_same_1() {
    String one = "hello";
    String two = "hello";
    boolean actual = core.check(one, two);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void check_the_same_2() {
    String one = randomString.get();
    String two = one;
    boolean actual = core.check(one, two);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  public void check_different_1() {
    String one = "abc";
    String two = "abcd";
    boolean actual = core.check(one, two);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  public void check_different_2() {
    String one = "abc";
    String two = "bcd";
    boolean actual = core.check(one, two);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  public void check_second_is_null() {
    String one = "hello";
    String two = null;
    boolean actual = core.check(one, two);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  public void check_first_is_null() {
    String one = null;
    String two = "hello";
    boolean actual = core.check(one, two);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  public void check_both_are_null() {
    String one = null;
    String two = null;
    boolean actual = core.check(one, two);
    boolean expected = false;
    assertEquals(expected, actual);
  }

}

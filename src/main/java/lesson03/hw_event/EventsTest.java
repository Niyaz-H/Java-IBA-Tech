package lesson03.hw_event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventsTest {

  @Before
  public void b1() {
    System.out.println("-- before");
  }
  @After
  public void a1() {
    System.out.println("-- before");
  }

  @Test
  public void find1() {
    Events e = Events.create();
    assertEquals(true, e.find(1991));
  }

  @Test
  public void find2() {
    Events e = Events.create();
    assertEquals(false, e.find(1911));
  }

  @Test
  public void find3() {
    Events e = Events.create();
    assertEquals(true, e.find(2019));
  }
}

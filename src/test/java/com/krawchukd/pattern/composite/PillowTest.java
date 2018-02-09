package com.krawchukd.pattern.composite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PillowTest {

  private Pillow pillow;

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() throws Exception {
    pillow = new Pillow(20d);
  }

  @After
  public void tearDown() throws Exception {
    pillow = null;
  }

  @Test
  public void getComponent_shouldReturn_itSelf() {
    assertEquals(pillow.getComponent(), pillow);
  }

  @Test
  public void add_Item_ThrowsRuntimeException() {
    thrown.expect(RuntimeException.class);
    pillow.add(new Pillow(20d));
  }

  @Test
  public void remove_givenAnItem_ThrowsRuntimeException() {
    thrown.expect(RuntimeException.class);
    pillow.remove(new Pillow(20d));
  }

  @Test
  public void getItterator_shouldReturn_Itself() {
    Item item = null;
    Iterator<Item> iterator = pillow.getItterator();

    int numberOfItemsInIterator = 0;
    while (iterator.hasNext()) {
      item = iterator.next();
      numberOfItemsInIterator++;
    }

    assertNull(item);
    assertTrue(numberOfItemsInIterator == 0);
  }

  @Test
  public void getPrice_shouldReturn_Value() {
    assertTrue(pillow.getPrice().equals(20.00d));
  }
}

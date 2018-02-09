package com.krawchukd.pattern.composite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CouchTest {

  private Couch couch;

  @Before
  public void setUp() throws Exception {
    couch = new Couch(100d);
  }

  @After
  public void tearDown() throws Exception {
    couch = null;
  }

  @Test
  public void getPrice_shouldReturn_Value() {
    Pillow pillow = new Pillow(20d);
    couch.add(pillow);
    assertTrue(couch.getPrice().equals(120d));
  }

  @Test
  public void getComponent_shouldReturn_itSelf() {
    assertEquals(couch.getComponent().getComponent(), couch);
  }

  @Test
  public void add_anItem_IsAddedToItemList() {
    Pillow pillow = new Pillow(20d);

    assertFalse(couch.getItterator().hasNext());
    couch.add(pillow);
    assertTrue(couch.getItterator().next().equals(pillow));
  }

  @Test
  public void remove_anItem_IsRemovedFromItemList() {
    Pillow pillow = new Pillow(20d);
    couch.add(pillow);

    assertTrue(couch.getItterator().next().equals(pillow));
    couch.remove(pillow);
    assertFalse(couch.getItterator().hasNext());
  }
}

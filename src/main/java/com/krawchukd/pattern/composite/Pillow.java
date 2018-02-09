package com.krawchukd.pattern.composite;

public class Pillow extends Item {

  /****************************************************************************
   ** Constructors
   *****************************************************************************/
  public Pillow(Double price) {
    setMyPrice(price);
  }

  /****************************************************************************
   ** Items
   *****************************************************************************/
  @Override
  public Item getComponent() {
    return this;
  }

  @Override
  public void add(Item item) {
    throw new RuntimeException("Method not implemented in " + Pillow.class);
  }

  @Override
  public void remove(Item item) {
    throw new RuntimeException("Method not implemented in " + Pillow.class);
  }
}

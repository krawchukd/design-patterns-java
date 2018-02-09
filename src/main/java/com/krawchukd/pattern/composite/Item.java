package com.krawchukd.pattern.composite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class Item {

  /****************************************************************************
   ** Properites
   *****************************************************************************/

  protected Double myPrice;

  /****************************************************************************
   ** Item Methods
   *****************************************************************************/

  abstract public Item getComponent();

  abstract public void add(Item item);

  abstract public void remove(Item item);

  public Iterator<Item> getItterator() {
    List<Item> itemList = new LinkedList<Item>();
    return itemList.iterator();
  }

  public Double getPrice() {
    return myPrice;
  }

  protected void setMyPrice(Double myPrice) {
    this.myPrice = myPrice;
  }
}

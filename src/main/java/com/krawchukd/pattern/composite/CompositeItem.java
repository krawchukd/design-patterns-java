package com.krawchukd.pattern.composite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class CompositeItem extends Item {

  /****************************************************************************
   ** Properites
   *****************************************************************************/
  private List<Item> items;

  /****************************************************************************
   ** Constructors
   *****************************************************************************/
  public CompositeItem() {
    items = new LinkedList<>();
  }

  /****************************************************************************
   ** Getters/Setters
   *****************************************************************************/
  protected List<Item> getItems() {
    return items;
  }

  @Override
  public Item getComponent() {
    return this;
  }

  @Override
  public void add(Item item) {
    items.add(item);
  }

  @Override
  public void remove(Item item) {
    items.remove(item);
  }

  @Override
  public Iterator<Item> getItterator() {
    return items.listIterator();
  }

  @Override
  public Double getPrice() {
    Double aggregatePrice = new Double(myPrice);
    List<Item> items = this.getItems();
    for (Item item : items) {
      aggregatePrice += item.getPrice();
    }
    return aggregatePrice;
  }
}

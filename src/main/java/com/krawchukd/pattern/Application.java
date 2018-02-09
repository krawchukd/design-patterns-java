package com.krawchukd.pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.krawchukd.pattern.composite.Couch;
import com.krawchukd.pattern.composite.Item;
import com.krawchukd.pattern.composite.Pillow;

public class Application {
  private static Logger logger = LogManager.getLogger(Application.class);

  public static void main(String[] args) {
    logger.info("Starting application.");

    Item persianCouch = new Couch(100d);
    logger.info(
        String.format("Persian Couch with one pillow total price: $%.2f", persianCouch.getPrice()));

    persianCouch.add(new Pillow(20d));
    logger.info(
        String.format("Persian Couch with one pillow total price: $%.2f", persianCouch.getPrice()));

  }
}

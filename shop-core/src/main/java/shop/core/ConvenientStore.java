package shop.core;

import shop.api.Store;

/**
 * @author Mincong Huang
 * @since 1.0
 */
public class ConvenientStore implements Store {

  @Override
  public String getName() {
    return "Convenient Store";
  }

  @Override
  public String getAddress() {
    return "Somewhere in Paris";
  }
}

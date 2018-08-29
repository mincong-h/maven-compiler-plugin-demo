package shop.core;

import org.junit.Test;
import shop.api.Store;

import static org.junit.Assert.assertNotNull;

/**
 * @author Mincong Huang
 * @since 1.0
 */
public class ConvenientStoreTest {

  @Test
  public void testStore() {
    Store store = new ConvenientStore();
    assertNotNull(store.getName());
    assertNotNull(store.getAddress());
  }
}

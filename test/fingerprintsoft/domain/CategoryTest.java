package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.ICategory;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class CategoryTest extends TestCase {

	/**
	 * Test of Name for method, of class Category.
	 */
	public void testCategoryName() {
		ICategory instance = new Category();
		instance.setName("health and fitness");
		assertNotNull(instance);
		assertEquals("health and fitness", instance.getName());
	}

	/**
	 * Test of Type for method, of class Category.
	 */
	public void testCategoryType() {
		ICategory instance = new Category();
		instance.setType("Sports and nutrition");
		assertNotNull(instance);
		assertEquals("Sports and nutrition", instance.getType());
	}
}

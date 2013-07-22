package fingerprintsoft.resource;

import fingerprintsoft.domain.Category;
import fingerprintsoft.resource.interfaces.ICategoryResource;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class JDBCCategoryResourceTest extends TestCase {

	/**
	 * Test of getCategory method, of class JDBCCategoryResource.
	 */
	public void testGetCategory() {
		ICategoryResource instance = new JDBCCategoryResource();
		instance.getCategory("");
		assertNull(instance);
		assertEquals(" ", instance.getCategory());
	}

	/**
	 * Test of insert method, of class JDBCCategoryResource.
	 */
	public void testInsert_Category() {
		ICategoryResource instance = new JDBCCategoryResource();
		instance.insert("Test");
		assertNull(instance);
		assertEquals("Test",instance.insert());
	}

	/**
	 * Test of update method, of class JDBCCategoryResource.
	 */
	public void testUpdate_Category() {
		ICategoryResource instance = new JDBCCategoryResource();
		instance.update("test1");
		assertNull(instance);
		
	}

	/**
	 * Test of delete method, of class JDBCCategoryResource.
	 */
	public void testDelete_String() {
		ICategoryResource instance = new JDBCCategoryResource();
		instance.delete("test");
		assertNull(instance);
		assertEquals("test", instance.delete());
	}

	/**
	 * Test of findCategory method, of class JDBCCategoryResource.
	 */
	public void testFindCategory() {
		ICategoryResource instance = new JDBCCategoryResource();
		instance.findCategory("test");
		assertNull(instance);
		assertEquals("test", instance.findCategory());
	}

	/**
	 * Test of findCategory method, of class JDBCCategoryResource.
	 */
	public void testFindCategory_String() {
		ICategoryResource instance = new JDBCCategoryResource();
		instance.findCategory("test");
		assertNull(instance);
		assertEquals("test", instance.findCategory());
	}

	/**
	 * Test of insert method, of class JDBCCategoryResource.
	 */
	public void testInsert_ICategory() {
		ICategoryResource instance = new JDBCCategoryResource();
		instance.insert("test");
		assertNull(instance);
		assertEquals("test",instance.insert());
	}

	/**
	 * Test of update method, of class JDBCCategoryResource.
	 */
	public void testUpdate_ICategory() {
		ICategoryResource instance = new JDBCCategoryResource();
		instance.update("update Test");
		assertNull(instance);
		assertEquals("update Test", instance.update());
	}
}

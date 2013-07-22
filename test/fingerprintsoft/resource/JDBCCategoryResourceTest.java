package fingerprintsoft.resource;

import fingerprintsoft.domain.Category;
import fingerprintsoft.domain.interfaces.ICategory;
import fingerprintsoft.resource.interfaces.ICategoryResource;
import java.util.List;
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
		Category category = "Test";
		ICategoryResource instance = new JDBCCategoryResource();
		instance.insert(category);
		assertNull(instance);
		assertEquals("Test",instance.insert());
	}

	/**
	 * Test of update method, of class JDBCCategoryResource.
	 */
	public void testUpdate_Category() {
		String category = "test1";
		ICategoryResource instance = new JDBCCategoryResource();
		instance.update(category);
		assertNull(instance);
		assertEquals("test1",instance.update());
		
	}

	/**
	 * Test of delete method, of class JDBCCategoryResource.
	 */
	public void testDelete_String() {
		String name = "";
		ICategoryResource instance = new JDBCCategoryResource();
		instance.delete(name);
		assertNull(instance);
		assertEquals(name, instance.delete());
	}

	/**
	 * Test of findCategory method, of class JDBCCategoryResource.
	 */
	public void testFindCategory() {
		ICategoryResource instance = new JDBCCategoryResource();
		instance.findCategory("");
		assertNull(instance);
		assertEquals("", instance.findCategory());
	}

	/**
	 * Test of findCategory method, of class JDBCCategoryResource.
	 */
	public void testFindCategory_String() {
		String name = "";
		ICategoryResource instance = new JDBCCategoryResource();
		List expResult = null;
		List result = instance.findCategory(name);
		assertNull(instance);
		assertEquals(expResult, result);
	}

	/**
	 * Test of insert method, of class JDBCCategoryResource.
	 */
	public void testInsert_ICategory() {
		ICategory category = null;
		ICategoryResource instance = new JDBCCategoryResource();
		assertNull(instance);
		instance.insert(category);
	}

	/**
	 * Test of update method, of class JDBCCategoryResource.
	 */
	public void testUpdate_ICategory() {
		ICategory category = null;
		ICategoryResource instance = new JDBCCategoryResource();
		assertNull(instance);
		instance.update(category);
	}

	/**
	 * Test of delete method, of class JDBCCategoryResource.
	 */
	public void testDelete_Long() {
		Long id = null;
		ICategoryResource instance = new JDBCCategoryResource();
		ICategory expResult = null;
		ICategory result = instance.delete(id);
		assertNull(instance);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getCategory method, of class JDBCCategoryResource.
	 */
	public void testGetCategory_Long() {
		Long id = null;
		ICategoryResource instance = new JDBCCategoryResource();
		ICategory expResult = null;
		ICategory result = instance.getCategory(id);
		assertNull(instance);
		assertEquals(expResult, result);
	}
}

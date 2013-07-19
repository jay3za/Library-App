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
		System.out.println("getCategory");
		ICategoryResource instance = new JDBCCategoryResource();
		List expResult = null;
		List result = instance.getCategory();
		assertNull(instance);
		assertEquals(expResult, result);
	}

	/**
	 * Test of insert method, of class JDBCCategoryResource.
	 */
	public void testInsert_Category() {
		System.out.println("insert");
		Category category = null;
		ICategoryResource instance = new JDBCCategoryResource();
		assertNull(instance);
		instance.insert(category);
	}

	/**
	 * Test of update method, of class JDBCCategoryResource.
	 */
	public void testUpdate_Category() {
		System.out.println("update");
		Category category = null;
		ICategoryResource instance = new JDBCCategoryResource();
		assertNull(instance);
		instance.update(category);
	}

	/**
	 * Test of delete method, of class JDBCCategoryResource.
	 */
	public void testDelete_String() {
		System.out.println("delete");
		String name = "";
		ICategoryResource instance = new JDBCCategoryResource();
		Category expResult = null;
		Category result = instance.delete(name);
		assertNull(instance);
		assertEquals(expResult, result);
	}

	/**
	 * Test of findCategory method, of class JDBCCategoryResource.
	 */
	public void testFindCategory() {
		System.out.println("findCategory");
		ICategoryResource instance = new JDBCCategoryResource();
		List expResult = null;
		List result = instance.findCategory();
		assertNull(instance);
		assertEquals(expResult, result);
	}

	/**
	 * Test of findCategory method, of class JDBCCategoryResource.
	 */
	public void testFindCategory_String() {
		System.out.println("findCategory");
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
		System.out.println("insert");
		ICategory category = null;
		ICategoryResource instance = new JDBCCategoryResource();
		assertNull(instance);
		instance.insert(category);
	}

	/**
	 * Test of update method, of class JDBCCategoryResource.
	 */
	public void testUpdate_ICategory() {
		System.out.println("update");
		ICategory category = null;
		ICategoryResource instance = new JDBCCategoryResource();
		assertNull(instance);
		instance.update(category);
	}

	/**
	 * Test of delete method, of class JDBCCategoryResource.
	 */
	public void testDelete_Long() {
		System.out.println("delete");
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
		System.out.println("getCategory");
		Long id = null;
		ICategoryResource instance = new JDBCCategoryResource();
		ICategory expResult = null;
		ICategory result = instance.getCategory(id);
		assertNull(instance);
		assertEquals(expResult, result);
	}
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprintsoft.resource;

import fingerprintsoft.domain.Category;
import fingerprintsoft.domain.interfaces.ICategory;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class JDBCCategoryResourceTest extends TestCase {
	
	public JDBCCategoryResourceTest(String testName) {
		super(testName);
	}

	/**
	 * Test of getCategory method, of class JDBCCategoryResource.
	 */
	public void testGetCategory() {
		System.out.println("getCategory");
		JDBCCategoryResource instance = new JDBCCategoryResource();
		List expResult = null;
		List result = instance.getCategory();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of insert method, of class JDBCCategoryResource.
	 */
	public void testInsert_Category() {
		System.out.println("insert");
		Category category = null;
		JDBCCategoryResource instance = new JDBCCategoryResource();
		instance.insert(category);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of update method, of class JDBCCategoryResource.
	 */
	public void testUpdate_Category() {
		System.out.println("update");
		Category category = null;
		JDBCCategoryResource instance = new JDBCCategoryResource();
		instance.update(category);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of delete method, of class JDBCCategoryResource.
	 */
	public void testDelete_String() {
		System.out.println("delete");
		String name = "";
		JDBCCategoryResource instance = new JDBCCategoryResource();
		Category expResult = null;
		Category result = instance.delete(name);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of findCategory method, of class JDBCCategoryResource.
	 */
	public void testFindCategory() {
		System.out.println("findCategory");
		JDBCCategoryResource instance = new JDBCCategoryResource();
		List expResult = null;
		List result = instance.findCategory();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of findCategory method, of class JDBCCategoryResource.
	 */
	public void testFindCategory_String() {
		System.out.println("findCategory");
		String name = "";
		JDBCCategoryResource instance = new JDBCCategoryResource();
		List expResult = null;
		List result = instance.findCategory(name);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of insert method, of class JDBCCategoryResource.
	 */
	public void testInsert_ICategory() {
		System.out.println("insert");
		ICategory category = null;
		JDBCCategoryResource instance = new JDBCCategoryResource();
		instance.insert(category);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of update method, of class JDBCCategoryResource.
	 */
	public void testUpdate_ICategory() {
		System.out.println("update");
		ICategory category = null;
		JDBCCategoryResource instance = new JDBCCategoryResource();
		instance.update(category);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of delete method, of class JDBCCategoryResource.
	 */
	public void testDelete_Long() {
		System.out.println("delete");
		Long id = null;
		JDBCCategoryResource instance = new JDBCCategoryResource();
		ICategory expResult = null;
		ICategory result = instance.delete(id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getCategory method, of class JDBCCategoryResource.
	 */
	public void testGetCategory_Long() {
		System.out.println("getCategory");
		Long id = null;
		JDBCCategoryResource instance = new JDBCCategoryResource();
		ICategory expResult = null;
		ICategory result = instance.getCategory(id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}

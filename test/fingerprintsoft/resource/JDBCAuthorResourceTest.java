/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprintsoft.resource;

import fingerprintsoft.domain.Author;
import fingerprintsoft.domain.interfaces.IAuthor;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class JDBCAuthorResourceTest extends TestCase {
	
	public JDBCAuthorResourceTest(String testName) {
		super(testName);
	}

	/**
	 * Test of insert method, of class JDBCAuthorResource.
	 */
	public void testInsert() {
		System.out.println("insert");
		IAuthor author = null;
		JDBCAuthorResource instance = new JDBCAuthorResource();
		instance.insert(author);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of findAuthors method, of class JDBCAuthorResource.
	 */
	public void testFindAuthors_String() {
		System.out.println("findAuthors");
		String name = "";
		JDBCAuthorResource instance = new JDBCAuthorResource();
		List expResult = null;
		List result = instance.findAuthors(name);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of update method, of class JDBCAuthorResource.
	 */
	public void testUpdate() {
		System.out.println("update");
		IAuthor author = null;
		JDBCAuthorResource instance = new JDBCAuthorResource();
		instance.update(author);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of delete method, of class JDBCAuthorResource.
	 */
	public void testDelete() {
		System.out.println("delete");
		Long id = null;
		JDBCAuthorResource instance = new JDBCAuthorResource();
		IAuthor expResult = null;
		IAuthor result = instance.delete(id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of findAuthors method, of class JDBCAuthorResource.
	 */
	public void testFindAuthors_0args() {
		System.out.println("findAuthors");
		JDBCAuthorResource instance = new JDBCAuthorResource();
		List expResult = null;
		List result = instance.findAuthors();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getNames method, of class JDBCAuthorResource.
	 */
	public void testGetNames() {
		System.out.println("getNames");
		JDBCAuthorResource instance = new JDBCAuthorResource();
		Author expResult = null;
		Author result = instance.getNames();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}

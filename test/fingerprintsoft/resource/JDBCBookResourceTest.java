/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprintsoft.resource;

import fingerprintsoft.domain.Book;
import fingerprintsoft.domain.interfaces.IBook;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class JDBCBookResourceTest extends TestCase {
	
	public JDBCBookResourceTest(String testName) {
		super(testName);
	}

	/**
	 * Test of insert method, of class JDBCBookResource.
	 */
	public void testInsert_Book() {
		System.out.println("insert");
		Book book = null;
		JDBCBookResource instance = new JDBCBookResource();
		instance.insert(book);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of update method, of class JDBCBookResource.
	 */
	public void testUpdate_Book() {
		System.out.println("update");
		Book book = null;
		JDBCBookResource instance = new JDBCBookResource();
		instance.update(book);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of delete method, of class JDBCBookResource.
	 */
	public void testDelete_Integer() {
		System.out.println("delete");
		Integer bookNumber = null;
		JDBCBookResource instance = new JDBCBookResource();
		Book expResult = null;
		Book result = instance.delete(bookNumber);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of findBooks method, of class JDBCBookResource.
	 */
	public void testFindBooks_String() {
		System.out.println("findBooks");
		String name = "";
		JDBCBookResource instance = new JDBCBookResource();
		List expResult = null;
		List result = instance.findBooks(name);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getAuthor method, of class JDBCBookResource.
	 */
	public void testGetAuthor() {
		System.out.println("getAuthor");
		Long id = null;
		JDBCBookResource instance = new JDBCBookResource();
		IBook expResult = null;
		IBook result = instance.getAuthor(id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of insert method, of class JDBCBookResource.
	 */
	public void testInsert_IBook() {
		System.out.println("insert");
		IBook book = null;
		JDBCBookResource instance = new JDBCBookResource();
		instance.insert(book);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of update method, of class JDBCBookResource.
	 */
	public void testUpdate_IBook() {
		System.out.println("update");
		IBook book = null;
		JDBCBookResource instance = new JDBCBookResource();
		instance.update(book);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of delete method, of class JDBCBookResource.
	 */
	public void testDelete_Long() {
		System.out.println("delete");
		Long id = null;
		JDBCBookResource instance = new JDBCBookResource();
		IBook expResult = null;
		IBook result = instance.delete(id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of findBooks method, of class JDBCBookResource.
	 */
	public void testFindBooks_0args() {
		System.out.println("findBooks");
		JDBCBookResource instance = new JDBCBookResource();
		List expResult = null;
		List result = instance.findBooks();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}

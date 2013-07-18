/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.IAuthor;
import fingerprintsoft.domain.interfaces.IBook;
import fingerprintsoft.domain.interfaces.ICategory;
import fingerprintsoft.domain.interfaces.IMediaType;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class BookTest extends TestCase {
	/**
	 * Test of getName method, of class Book.
	 */
	public void testBookName() {
		IBook instance = new PhysicalBook();
		instance.setName("who we are");
		
		assertNotNull(instance);
		assertEquals("who we are", instance.getName());
		assertNotNull("dummy string", instance.getName());
	}

	/**
	 * Test of getNumber method, of class Book.
	*/ 
	public void testBookNumber() {
		System.out.println("getNumber");
		IBook instance = new ElectronicBook();
		instance.setNumber(123);
		assertEquals(123, instance.getNumber());
	}

	/**
	 * Test of Author method, of class Book.
	 **/
	public void testBookAuthor() {
		IAuthor instance = new Author();
		instance.setName("Tommy");
		
		assertEquals( "Tommy", instance.getName());		
		assertNotNull(instance);
	}

	/**
	 * Test of getCategory method, of class Book.
	 **/
	public void testBookCategory() {
		ICategory instance = new Category();
		instance.setName("java for dummies");
		
		assertNotNull(instance);
		assertEquals("java for dummies",instance.getName());
	}

	public class BookImpl extends Book {

		public BookImpl() {
			super(null);
		}
	} 
}

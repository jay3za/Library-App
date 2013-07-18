/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprintsoft.resource;

import fingerprintsoft.domain.MediaType;
import fingerprintsoft.domain.interfaces.IMediaType;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class JDBCMediaTypeResourceTest extends TestCase {
	
	public JDBCMediaTypeResourceTest(String testName) {
		super(testName);
	}

	/**
	 * Test of getMediaType method, of class JDBCMediaTypeResource.
	 */
	public void testGetMediaType() {
		System.out.println("getMediaType");
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		List expResult = null;
		List result = instance.getMediaType();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of insert method, of class JDBCMediaTypeResource.
	 */
	public void testInsert_MediaType() {
		System.out.println("insert");
		MediaType mediaType = null;
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		instance.insert(mediaType);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of update method, of class JDBCMediaTypeResource.
	 */
	public void testUpdate_MediaType() {
		System.out.println("update");
		MediaType mediaType = null;
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		instance.update(mediaType);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of delete method, of class JDBCMediaTypeResource.
	 */
	public void testDelete_String() {
		System.out.println("delete");
		String coverType = "";
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		MediaType expResult = null;
		MediaType result = instance.delete(coverType);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of findMediaType method, of class JDBCMediaTypeResource.
	 */
	public void testFindMediaType_0args() {
		System.out.println("findMediaType");
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		List expResult = null;
		List result = instance.findMediaType();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of findMediaType method, of class JDBCMediaTypeResource.
	 */
	public void testFindMediaType_String() {
		System.out.println("findMediaType");
		String name = "";
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		List expResult = null;
		List result = instance.findMediaType(name);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of insert method, of class JDBCMediaTypeResource.
	 */
	public void testInsert_IMediaType() {
		System.out.println("insert");
		IMediaType mediaType = null;
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		instance.insert(mediaType);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of update method, of class JDBCMediaTypeResource.
	 */
	public void testUpdate_IMediaType() {
		System.out.println("update");
		IMediaType mediaType = null;
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		instance.update(mediaType);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of delete method, of class JDBCMediaTypeResource.
	 */
	public void testDelete_Long() {
		System.out.println("delete");
		Long id = null;
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		IMediaType expResult = null;
		IMediaType result = instance.delete(id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getAuthor method, of class JDBCMediaTypeResource.
	 */
	public void testGetAuthor() {
		System.out.println("getAuthor");
		Long id = null;
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		IMediaType expResult = null;
		IMediaType result = instance.getAuthor(id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}

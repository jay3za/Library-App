/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprintsoft.resource;

import fingerprintsoft.domain.MediaType;
import fingerprintsoft.domain.interfaces.IMediaType;
import fingerprintsoft.resource.interfaces.IMediaTypeResources;
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
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		//instance.getMediaType();
		//assertEquals();
	}

	/**
	 * Test of insert method, of class JDBCMediaTypeResource.
	 */
	public void testInsert_MediaType() {
		System.out.println("insert");
		MediaType mediaType = null;
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.insert(mediaType);
	}

	/**
	 * Test of update method, of class JDBCMediaTypeResource.
	 */
	public void testUpdate_MediaType() {
		System.out.println("update");
		MediaType mediaType = null;
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.update(mediaType);
	}

	/**
	 * Test of delete method, of class JDBCMediaTypeResource.
	 */
	public void testDelete_String() {
		System.out.println("delete");
		String coverType = "";
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		//instance.delete(coverType);
		//assertEquals(expResult, result);
	}

	/**
	 * Test of findMediaType method, of class JDBCMediaTypeResource.
	 */
	public void testFindMediaType() {
		System.out.println("findMediaType");
		String name = "";
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.findMediaType(name);
		//assertEquals(expResult, result);
	}

	/**
	 * Test of insert method, of class JDBCMediaTypeResource.
	 */
	public void testInsert_IMediaType() {
		System.out.println("insert");
		IMediaType mediaType = null;
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.insert(mediaType);
	}

	/**
	 * Test of update method, of class JDBCMediaTypeResource.
	 */
	public void testUpdate_IMediaType() {
		System.out.println("update");
		IMediaType mediaType = null;
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.update(mediaType);
	}
}

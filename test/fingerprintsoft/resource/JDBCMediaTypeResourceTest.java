package fingerprintsoft.resource;

import fingerprintsoft.constants.MediaTypeConstants;
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

	/**
	 * Test of insert method, of class JDBCMediaTypeResource.
	 */
	public void testInsert_MediaType() {
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.insert("electronic");
		assertNull(instance);
		
	}

	/**
	 * Test of update method, of class JDBCMediaTypeResource.
	 */
	public void testUpdate_MediaType() {
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.update("Electronic");
		assertNull(instance);
	}

	/**
	 * Test of delete method, of class JDBCMediaTypeResource.
	 */
	public void testDelete_String() {
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.delete();
		assertNull(instance);
		//assertEquals("electronic", instance.delete("electronic"));
		
	}

	/**
	 * Test of findMediaType method, of class JDBCMediaTypeResource.
	 */
	public void testFindMediaType_String() {
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.findMediaType("electronic");
		assertNull(instance);
		//assertEquals("electronic", instance.findMediaType());
		
	}

	/**
	 * Test of getMediaType method, of class JDBCMediaTypeResource.
	 */
	public void testGetMediaType() {
		System.out.println("getMediaType");
		JDBCMediaTypeResource instance = new JDBCMediaTypeResourceImpl();
		List expResult = null;
		List result = instance.getMediaType();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of insert method, of class JDBCMediaTypeResource.
	 */
	public void testInsert() {
		System.out.println("insert");
		MediaType mediaType = null;
		JDBCMediaTypeResource instance = new JDBCMediaTypeResourceImpl();
		instance.insert(mediaType);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of update method, of class JDBCMediaTypeResource.
	 */
	public void testUpdate() {
		System.out.println("update");
		MediaType mediaType = null;
		JDBCMediaTypeResource instance = new JDBCMediaTypeResourceImpl();
		instance.update(mediaType);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of delete method, of class JDBCMediaTypeResource.
	 */
	public void testDelete() {
		System.out.println("delete");
		String coverType = "";
		JDBCMediaTypeResource instance = new JDBCMediaTypeResourceImpl();
		MediaType expResult = null;
		MediaType result = instance.delete(coverType);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	public class JDBCMediaTypeResourceImpl extends JDBCMediaTypeResource {
	}

}

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
		MediaType mediaType = null;
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.update(mediaType);
	}

	/**
	 * Test of delete method, of class JDBCMediaTypeResource.
	 */
	public void testDelete_String() {
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.delete("electronic");
		assertEquals("electronic", instance.delete("electronic"));
	}


	/**
	 * Test of findMediaType method, of class JDBCMediaTypeResource.
	 */
	public void testFindMediaType_String() {
		String name = "";
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		List expResult = null;
		List result = instance.findMediaType(name);
		assertEquals(expResult, result);
	}

}

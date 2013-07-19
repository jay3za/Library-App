package fingerprintsoft.resource;


import fingerprintsoft.resource.interfaces.IMediaTypeResources;
import fingerprintsoft.domain.interfaces.IMediaType;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class JDBCMediaTypeResourceTest extends TestCase {

	/**
	 * Test of getMediaType method, of class JDBCMediaTypeResource.
	 */
	public void testGetMediaType() {
		System.out.println("getMediaType");
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.findMediaType("tester");
		assertNotNull(instance);
		assertEquals("tester", instance.findMediaType());
	}

	/**
	 * Test of insert method, of class JDBCMediaTypeResource.
	 */
	public void testInsert_MediaType(IMediaType mediaType) {
		System.out.println("insert");
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.insert("tester");
		assertNotNull(instance);
		assertEquals("tester", instance.insert());		
	}

	/**
	 * Test of update method, of class JDBCMediaTypeResource.
	 */
	public void testUpdate_MediaType() {
		System.out.println("update");
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.update("tester");
		assertNotNull(instance);
		assertEquals("tester",instance.update());
	}

	/**
	 * Test of delete method, of class JDBCMediaTypeResource.
	 */
	public void testDelete_String() {
		System.out.println("delete");
		String coverType = "Hard";
		IMediaTypeResources instance = new JDBCMediaTypeResource();
		instance.delete("Hard");
		assertNull(instance);
		assertEquals("Hard", instance.delete());		
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
	}

	/**
	 * Test of insert method, of class JDBCMediaTypeResource.
	 */
	public void testInsert_IMediaType() {
		System.out.println("insert");
		IMediaType mediaType = null;
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		instance.insert(mediaType);
	}

	/**
	 * Test of update method, of class JDBCMediaTypeResource.
	 */
	public void testUpdate_IMediaType() {
		System.out.println("update");
		IMediaType mediaType = null;
		JDBCMediaTypeResource instance = new JDBCMediaTypeResource();
		instance.update(mediaType);
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
	}
}

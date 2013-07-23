package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.IMediaType;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class MediaTypeTest extends TestCase {

	/**
	 * Test of getType method, of class MediaType.
	 */
	public void testGetType() {
		IMediaType instance = new ElectronicMediaType();
		instance.setType("Electronic Media Type");
		assertEquals("Electronic Media Type", instance.getType());
	}

	/**
	 * Test of setType method, of class MediaType.
	 */
	public void testSetType() {
		IMediaType instance = new PhysicalMediaType("Hard");
		instance.setType("Physical Media Type");
		
		assertEquals("Physical Media Type", instance.getType());
		assertNotNull(instance);
	}
}

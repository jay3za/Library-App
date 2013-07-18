package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.IPhysicalMediaType;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class PhysicalMediaTypeTest extends TestCase {
	/**
	 * Test of getCoverType method, of class PhysicalMediaType.
	 */
	public void testCoverTypeHard() {
		IPhysicalMediaType instance = new PhysicalMediaType("Hard");
		instance.setCoverType("Hard");
		
		assertNotNull(instance);
		assertEquals("Hard", instance.getCoverType());
	}

	/**
	 * Test of setCoverType method, of class PhysicalMediaType.
	 */
	public void testCoverTypeSoft() {
		IPhysicalMediaType instance = new PhysicalMediaType("Soft");
		instance.setCoverType("Soft");
		
		assertNotNull(instance);
		assertEquals("Soft", instance.getCoverType());
	}
}

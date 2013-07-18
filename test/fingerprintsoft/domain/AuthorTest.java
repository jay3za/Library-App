package fingerprintsoft.domain;

import fingerprintsoft.domain.interfaces.IAuthor;
import junit.framework.TestCase;

/**
 *
 * @author Jackie
 */
public class AuthorTest extends TestCase {
	/**
	 * Test of getName and setName method, of class Author.
	 */
	public void testAuthorName() {
		System.out.println("getName");
		IAuthor author = new Author();
        author.setName("Tommy");
		
		assertNotNull(author);
		assertEquals("Tommy", author.getName());
		assertNotNull("dummy string", author.getName());
	}
}	
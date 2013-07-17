package fingerprintsoft.domain.test;

import fingerprintsoft.domain.Author;
import junit.framework.TestCase;//impoty junit4

/**
 * @author jackie
 */
public class AuthorTest extends TestCase {
    
    public void testAuthor() {
        Author author = new Author();
        author.setName("Test Author");
        
        assertNotNull(author);
        assertEquals("Test Author", author.getName());
        assertNotSame("Dummy string", author.getName());
    }

}

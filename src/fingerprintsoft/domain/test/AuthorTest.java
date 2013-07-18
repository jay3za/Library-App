package fingerprintsoft.domain.test;

import fingerprintsoft.domain.Author;
import junit.framework.Test;//impoty junit3
import junit.framework.TestCase;

/**
 * @author jackie
 */
public class AuthorTest extends TestCase {
	/**
	 *
	 * @param args
	 */
	public static void main(String[]args){
    
		
    public void testAuthor() {
		 Author author = new Author();
        author.setName("Test Author");
		
        
			assertNotNull(author);
			assertEquals("Test Author", author.getName());
			assertNotSame("Dummy string", author.getName());
		}

}

}
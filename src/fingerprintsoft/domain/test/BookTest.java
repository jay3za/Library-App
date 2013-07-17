package fingerprintsoft.domain.test;

import fingerprintsoft.domain.Book;
import fingerprintsoft.domain.PhysicalBook;
import fingerprintsoft.domain.interfaces.IBook;
import junit.framework.TestCase;

/**
 * @author jackie
 */
public class BookTest extends TestCase  {
    
	public void testPhysicalBookCreation(){
    //IMediaType mediaType;
    /**
     * TestS the book name
     */
    IBook book = new PhysicalBook(); 
	book.setName("Test book ");
    
    assertNotNull(book);
    assertEquals("Test book", book.getName());
    assertNotSame("Dummy string",book.getName());
    
    }

}

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
    
    /**
     * test the book number 
     */
    Book number=new Book();// cannot instantiate because categories is abstract What can I use instead?
    number.setNumber(123);
    
    assertNotNull(number);
    assertEquals("Test number ", number.getNumber());
    assertNotSame("Test Number not same ",number.getName());
    
    /**
     * test the book author 
     */
    Book author=new Book();// cannot instantiate because categories is abstract What can I use instead?
    author.setAuthor("Test author");
    
    assertNotNull(author);
    assertEquals("test author equals", author.getAuthor());
    assertNotSame("Test author not same ",author.getAuthor());
    
    /**
     * test the book category
     */
    Book category=new Book();// cannot instantiate because categories is abstract What can I use instead?
    category.setCategory("Test category");
    
    assertNotNull(category);
    assertEquals("test category equals ", category.getCategory());
    assertNotSame("test category not same ",category.getCategory());
    
    /**
     * test the book mediaType
     */
    Book mediaType=new Book();// cannot instantiate because categories is abstract What can I use instead?
    mediaType.setMediaType("Test mediaType");
    
    assertNotNull(mediaType);
    assertEquals("Test mediaType equals ", mediaType.getMediaType());
    assertNotSame("Test mediaType not same ", mediaType.getMediaType());
    }

}

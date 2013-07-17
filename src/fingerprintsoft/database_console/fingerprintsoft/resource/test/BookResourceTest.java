package fingerprintsoft.resource.test;

import fingerprintsoft.domain.Book;
import fingerprintsoft.domain.interfaces.IBook;
import fingerprintsoft.resource.JDBCBookResource;
import junit.framework.TestCase;
/**
 * @author jackie
 */
public class BookResourceTest extends TestCase {
    public void testInsertPhysicalBook(){
		//IBook book=(IBook) new JDBCBookResource();
        
        JDBCBookResource resource=new JDBCBookResource();
        
        Book name=new Book();// cannot instantiate because categories is abstract What can I use instead?
        name.setName("Pink panther test");        
        resource.insert(name);
        Book savedName= resource.getName();        
        assertNotNull(savedName);
        assertSame(name.getName(), savedName.getName());
        
        Book number=new Book() {};// cannot instantiate because categories is abstract What can I use instead?
        number.setNumber(123);        
        resource.insert(number);
        Book savedNumber=resource.getNumber();        
        assertNotNull(savedNumber);
        assertSame(number.getNumber(),savedNumber.getNumber());
        
        Book author=new Book();// cannot instantiate because categories is abstract What can I use instead?
        author.setAuthor("test123");
        resource.insert(author);
        Book savedAuthor=resource.getAuthor();
        assertNotNull(savedAuthor);
        assertSame(author.getAuthor(),savedAuthor.getAuthor());
    }
}

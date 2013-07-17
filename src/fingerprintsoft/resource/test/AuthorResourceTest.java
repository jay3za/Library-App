package fingerprintsoft.resource.test;

import fingerprintsoft.domain.Author;
import fingerprintsoft.resource.JDBCAuthorResource;
import fingerprintsoft.resource.interfaces.IAuthorResource;
import junit.framework.TestCase;

/**
 * @author jackie
 */
public class AuthorResourceTest extends TestCase {

    public void testInsertAuthor() {
        JDBCAuthorResource resource = new JDBCAuthorResource();
        
        Author names = new Author();
        names.setName("Jackie");
        
        resource.insert(names);
        Author savedAuthor = resource.getNames();
        
        assertNotNull(savedAuthor);
        assertSame(names.getName(), savedAuthor.getName());
    }
    
}

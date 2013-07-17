package fingerprintsoft.domain.test;

import fingerprintsoft.domain.Category;
import junit.framework.TestCase;

/**
 * @author jackie
 */
public class CategoryTest extends TestCase {
    
    public void testCategory(){
        Category categories=new Category();// cannot instantiate because categories is abstract What can I use instead?
        categories.setName("Test category");
        
        assertNotNull(categories);
        assertEquals("test category equals ", categories.getName());
        assertNotSame("test category not same ",categories.getName());
    
        Category type=new Category();// cannot instantiate because categories is abstract What can I use instead?
        type.setType("Type test");
        
        assertNotNull(type);
        assertEquals("test type equals",type.getType());
        assertNotSame("test type equals", type.getType());
        
    }
}

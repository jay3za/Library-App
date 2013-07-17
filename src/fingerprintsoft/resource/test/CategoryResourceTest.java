package fingerprintsoft.resource.test;

import org.junit.experimental.categories.Categories;

import fingerprintsoft.domain.Category;
import fingerprintsoft.domain.interfaces.ICategory;
import fingerprintsoft.resource.JDBCCategoryResource;
import junit.framework.TestCase;
/**
 * @author jackie
 */
public class CategoryResourceTest extends TestCase{
    public void testInsertCategory(){
        ICategory resource=(ICategory) new JDBCCategoryResource();
        
        Category name=new Category();
        name.setName("Fantacy");
        
        resource.insert(name);
        String savedName=resource.getName();
        
        assertNotNull(savedName);
        assertSame(name.getName(),savedName,getName());
    }
}
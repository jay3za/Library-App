package fingerprintsoft.resource.interfaces;

import java.util.List;
//import fingerprintsoft.domain.Category;
import fingerprintsoft.domain.interfaces.ICategory;

/**
 * @author jackie
 */
public interface ICategoryResource {
	List findCategory(String name);
	
    void insert(ICategory category);

    void update(ICategory category);

    ICategory delete(Long id);

    ICategory getCategory(Long id);	
	
}

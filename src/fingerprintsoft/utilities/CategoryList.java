package fingerprintsoft.utilities;

import java.util.List;
import java.util.ArrayList;

/**
 * @author jackie
 */
public abstract class CategoryList{
    public static List ListOfCategories(){
        List category=new ArrayList();
        
        category.add("Design");
        category.add("Language");
        category.add("Database");
        category.add("");       
        
        return category;
        
    }
}


package fingerprintsoft.utilities;

import java.util.Iterator;
import java.util.List;

/**
 * @author jackie
 */
public class ImportCategoryList {
    public static void importCategoryList(List category) throws Exception  {
        
        Iterator it = (Iterator) category.iterator();
        String categories="";
        while(it.hasNext()){
            categories = (String)it.next();
            insertCategoryList(categories);
            
        }
    }

    public static void insertCategoryList(String category) throws Exception {
        String sql  = "insert into category (categoryname) values ('"+category+"')";
        fingerprintsoft.main.LibraryMain.update(sql);
    }
}

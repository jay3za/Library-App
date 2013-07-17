package fingerprintsoft.main;

import java.util.*;

public class Tester 
{
	public static void main(String[] args) throws Exception
	{
		List authors = fingerprintsoft.utilities.AuthorList.ListOfAuthors();
		fingerprintsoft.utilities.ImportAuthorList.importAuthorList(authors);
		
		List books =fingerprintsoft.utilities.BookNameList.ListOfBooks();
		fingerprintsoft.utilities.ImportBookList.importBookNameList(books);
		
		List category=fingerprintsoft.utilities.CategoryList.ListOfCategories();
        fingerprintsoft.utilities.ImportCategoryList.importCategoryList(category);
	}
}

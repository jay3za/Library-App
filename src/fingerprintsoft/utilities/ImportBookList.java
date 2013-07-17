package fingerprintsoft.utilities;

import java.util.Iterator;
import java.util.List;

public class ImportBookList {
	public static void importBookNameList(List books) throws Exception{
	
		Iterator it = (Iterator) books.iterator();
		String book;
		while(it.hasNext()){
			book = (String)it.next();
			insertBookNameList(book);
			
		}
		
	}

	public static void insertBookNameList(String book) throws Exception
	{
		String sql  = "insert into book (bookname) values ('"+book+"')";
		fingerprintsoft.main.LibraryMain.update(sql);
	}
}

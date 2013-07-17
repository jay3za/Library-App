package fingerprintsoft.utilities;

//import java.util.ArrayList;

import java.util.*;
/**
 * @author Jackie
 */
public class ImportAuthorList{
	public static void importAuthorList(List authors) throws Exception	{
		/*   // Just another way to iterate through authors
		int i =0;
		int size = authors.size();
		for(i=0;i<size;i++)
		{
			String author = (String)authors.get(i);
		}
		*/
		
		Iterator it = (Iterator) authors.iterator();
		String author;
		while(it.hasNext())		{
			author = (String)it.next();
			insertAuthor(author);
			
		}
	}
	
	public static void insertAuthor(String author) throws Exception	{
		String sql  = "insert into author (authorname) values ('"+author+"')";
		fingerprintsoft.main.LibraryMain.update(sql);
	}
}

package fingerprintsoft.domain.services;

import fingerprintsoft.domain.Book;
import java.util.Scanner;

/**
 *
 * @author Jackie
 */
public class SearchServices {
	Book name=null;
	public void BookSearch(){
		//search for a book
		Scanner searchName = new Scanner(System.in);
		System.out.println("Whant is the book name you want to search?");
		String input = searchName.next().toLowerCase();
	
	} 
}


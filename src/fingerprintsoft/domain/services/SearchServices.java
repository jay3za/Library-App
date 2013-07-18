package fingerprintsoft.domain.services;

import fingerprintsoft.domain.Book;
import java.util.Scanner;

/**
 *
 * @author Jackie
 */
public class SearchServices{
	//search book name
	Book name = null;
	public void BookSearch(){
		Scanner searchword = new Scanner(System.in);
		System.out.println("Please enter the book name you want to search.");		
		String input = searchword.next();
		char firstLetter = input.charAt(0);
		
		//Scanner input = new Scanner();
		
		while (input.hasNext()){
			String name = input.next();
			if (name.charAt(0) == firstLetter);{
			System.out.println(name + " ");
			}
		}
		input.close();		
	}
}

package fingerprintsoft.domain.services;

import fingerprintsoft.domain.Book;
import fingerprintsoft.domain.interfaces.IBook;
import java.util.Scanner;

/**
 *
 * @author Jackie
 */
//<<<<<<< HEAD
public class SearchServices{
	//search book name
	IBook name = null;
	public void BookSearch(){
		Scanner searchword = new Scanner(System.in);
		System.out.println("Please enter the book name you want to search.");		
		String input = searchword.next();
		char firstLetter = input.charAt(0);
		
		Scanner searchName = new Scanner(System.in);
		System.out.println("Whant is the book name you want to search?");
		String input = searchName.next();
		
			while (input.hasNext()){
			String name = input.next();
			if (name.charAt(0) == firstLetter);{
			System.out.println(name + " ");
			}
		}
			
	}

}

//>>>>>>> jackie_branch

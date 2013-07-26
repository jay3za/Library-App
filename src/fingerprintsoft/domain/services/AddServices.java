package fingerprintsoft.domain.services;

import fingerprintsoft.database.LibraryConnection;
import fingerprintsoft.domain.Book;
import fingerprintsoft.domain.interfaces.IBook;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jackie
 */
public class AddServices{
	static List<String> UserList = new ArrayList<String>();
	static List<Book> BookList = new ArrayList<Book>();
	static int choice ; 
	static Scanner userInput = new Scanner(System.in);
	static Scanner choiceInput = new Scanner(System.in);
	
		public void emptyLibrary(){
			Connection conn = LibraryConnection.getConnection();
			System.out.println("> WARNING < You have chosen to delete all books in the library! ");
			System.out.println("> Are you sure?? Enter yes or no: ");
			String confirmation = userInput.nextLine();
			try{
				if(confirmation.equalsIgnoreCase("yes")){
					System.out.println("> Library is being deleted...");
					
					BookList.clear();
					System.out.println("> Library is Empty!");
					choice = 7;
				}
			}catch(InputMismatchException error){
				System.out.println("<ERROR> Make sure you spell yes or no correctrly: ");
				choice = 6;
		}
	}		
	//autor.services.add();
	public void addBook(){
		IBook newBook = new Book() {}; //create new book object with status "Available."
		newBook.getBook();
		BookList.add(newBook);//add the book to the BookList ArrayList.
		System.out.println("---------------------------------------------------------");
		System.out.println("> You have successfully added the book to the library!\n");
		System.out.println("---------------------------------------------------------");	
	}
}
/**
 * this layer of services should call the resources layer for stuff and can also ask its
 * service friends for stuff it wants to verify of update etc...
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fingerprintsoft.domain.services;

import java.util.InputMismatchException;

/**
 *
 * @author Jackie
 */
public class DeleteServices {
	public void removeBook(){
		int i = 0;
		System.out.println("---------------------------------------------------------");
		System.out.println("> Here are all the books registered in the library: ");
		System.out.println("---------------------------------------------------------");
 
		while (i < BookList.size() && BookList.size() > 0){//show the user the list of all the books
			System.out.printf("\n> Book number %s:\n%s",i+1,BookList.get(i));
			i = i+1;
		}//end of while loop.
 
		System.out.println("\n\n> Choose an available book from the above list and write down it's number: ");
		int BookChoice = choiceInput.nextInt()-1;//register user's book choice.
 
		while(choice == 5){
			try{
				if (BookChoice > 0 && BookChoice < BookList.size() && BookList.get(BookChoice).status.equalsIgnoreCase("Available")){//Check if the book to be borrowed is available.
					//Print the borrowed book information and change the book status to borrowed.
					BookList.remove(BookChoice);
					System.out.printf("\n> You have chosen to delete the following book: %s\n", BookList.get(BookChoice));
					System.out.printf("\n> The Book %s is deleted.\n", BookList.get(BookChoice));
					choice = 7;
				}
			}catch(InputMismatchException error){
				System.out.println("<ERROR> Please enter a number of book from the list: ");
				choiceInput.nextInt();
				choice = 5;
			}catch(IndexOutOfBoundsException error){
				System.out.println("<ERROR> Please enter a number of book from the list: ");
				choice = 5;
			}
		}		
	}
}

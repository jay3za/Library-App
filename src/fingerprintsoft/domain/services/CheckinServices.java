package fingerprintsoft.domain.services;

/**
 *
 * @author Jackie
 */
public class CheckinServices {
	public void returnBook(){
		System.out.println("> Enter the Title of the book you want to return: ");
		String returnBookTitle = userInput.nextLine();
		int x = 0;
		while (x < BookList.size()){//Search for the book by title, if it exists change it's status,
									//it's borrower and borrowDate.
			if (BookList.get(x).title.equalsIgnoreCase(returnBookTitle)){
				BookList.get(x).status = "Available";
				BookList.get(x).borrower = "none";
				BookList.get(x).borrowDate = "none";
				System.out.println("> You have successfully returned the book to the library!");
				Book.displayFirstMenu();//Display main menu.
				choice = choiceInput.nextInt();//Register new choice.
				break;//if a title is found, break out of the loop and display choice menu.
			}
			x = x+1;
		}//end of while loop.
		x = 0;
		while (x < BookList.size() && BookList.size() > 0){//Search for the title and if it's not in the library, 
									//print a warning message to the user, and register a new menu choice.
			if (BookList.get(x).title.equalsIgnoreCase(returnBookTitle)){
		}else{
			System.out.println("> The are no books with this title in the library." +
					" Please make sure the title is spelt correctly or choose to add the book " +
					"to the library from the main menu. ");
			Book.displayFirstMenu();//Display main menu.
			choice = choiceInput.nextInt();//Register new choice.					
			}//End of else statement.
		}//End of while loop.
		Book.displayFirstMenu();//Display main menu.
		choice = choiceInput.nextInt();//Register new choice.
	}
}

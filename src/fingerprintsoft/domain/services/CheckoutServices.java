package fingerprintsoft.domain.services;

/**
 *
 * @author Jackie
 */
public class CheckoutServices {
	public void borrowBook(){
		System.out.println("---------------------------------------------------------");
		System.out.println("> Here are all the books registered in the library: ");
		System.out.println("---------------------------------------------------------");		
		displayBookList();
 
		borrowLoop1:
		while(choice == 3){
			System.out.println("\n\n> Choose an available book from the above list and write down it's index number: ");
			BookChoice = choiceInput.nextInt()-1;//register user's book choice.
			if(BookChoice > BookList.size()){
				System.out.println("> The number of the book you entered is not in the list!");
				choice = 7;
			}else if(BookChoice <= BookList.size()){
				break borrowLoop1;
			}
		}		
 
		borrowLoop2:
		while(choice == 3){
			//Check if the book to be borrowed is available.
			if (BookList.get(BookChoice).status.equalsIgnoreCase(status1) && BookList.size() >= BookChoice){
				//Print the borrowed book information and change the book status to borrowed.
				BookList.get(BookChoice).status = "Borrowed";
				System.out.printf("\n> You have chosen the following book: %s\n", BookList.get(BookChoice).displayBook());
 
				//add the user name to the book borrower variable:
				BookList.get(BookChoice).borrower = borrower;
				BookList.get(BookChoice).borrowDate = "Today.";
				BookList.get(BookChoice).returnDate = "In two weeks.";
				System.out.println("> You have to return the book in two weeks!");
				choice = 7;
				break borrowLoop2;
 
			}else if(BookList.get(BookChoice).status.equalsIgnoreCase(status2) && BookList.size() >= BookChoice){
				System.out.println("> The Book you are trying to borrow is unavailable!");
				choice = 7;
				break borrowLoop2;
			}else if(BookChoice > BookList.size()-1){
				System.out.println("> The number you entered in not in the list!");
				choice = 7;
				break borrowLoop2;
			}
		}
	}
}

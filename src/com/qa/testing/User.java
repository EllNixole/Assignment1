package com.qa.testing;



public class User {

	String username;
	String emailId;
	String password;
	Book[] newBooks;
	Book[] favouriteBooks;
	Book[] completedBooks;

	public User(String username, String emailId, String password) {
		super();
		this.username = username;
		this.emailId = emailId;
		this.password = password;
	}

	public static void signIn() {

		boolean loggedIn = false;

		while (loggedIn == false) {

			System.out.println("Please enter your username: ");
			String usernameInput = Main.input.nextLine();
			System.out.println("Please enter your password: ");
			String passwordInput = Main.input.nextLine();

			if (usernameInput.equals("Dani") && passwordInput.equals("123")) {
				System.out.println();
				System.out.println("******************************");
				System.out.println("        Welcome " + usernameInput + "!");
				System.out.println("******************************");
				System.out.println();
				loggedIn = true;
			}

			else {
				System.out.println("Username or password incorrect. Please try again.");
			}

		}

	}

	public static String displayMenu(User user, Book[] newBooks, Book[] favouriteBooks, Book[] completedBooks) {

		System.out.println("\n********** MENU **********\n");
		System.out.println("1. Type 'L' to see your Library");
		System.out.println("2. Type 'N' to see your New Books");
		System.out.println("3. Type 'F' to see your Favourites");
		System.out.println("4. Type 'C' to see your Completed Books");
		System.out.println("5. Type 'S' to search for a book");
		System.out.println("6. Type 'O' to log off");
		System.out.println();
		System.out.println("Search here: ");

		String search = Main.input.nextLine();
		
		
		if(!search.equals("L") && !search.equals("N") && !search.equals("F") && !search.equals("C") && !search.equals("S") && !search.equals("O")) {
			System.out.println("Unknown request. Please try again.");
			displayMenu(user, newBooks, favouriteBooks, completedBooks);
		}
		return search;	
		

		

	}

	public static String displayLibrary(User user, Book[] newBooks, Book[] favouriteBooks, Book[] completedBooks) {

		System.out.println("    ********* Your Library *********");
		System.out.println("\n------------------------------------------------------\n");

		for (Book book : newBooks) {

			System.out.println("    " + book.bookName + " by " + book.authorName);
			System.out.println("\n------------------------------------------------------\n");
		}

		for (Book book : favouriteBooks) {

			System.out.println("    " + book.bookName + " by " + book.authorName);
			System.out.println("\n------------------------------------------------------\n");
		}

		for (Book book : completedBooks) {

			System.out.println("    " + book.bookName + " by " + book.authorName);
			System.out.println("\n------------------------------------------------------\n");

		}
		System.out.println("    **** Press enter to return to the menu ****");
		String exit = Main.input.nextLine();
		return exit;
		}
   
	public static String displayNewBooks(User user, Book[] newBooks, Book[] favouriteBooks, Book[] completedBooks) {

		System.out.println("\n********** Your New Books **********\n");
		System.out.println("\n------------------------------------------------------\n");
		for (Book book : newBooks) {
			System.out.println("    " + book.bookName + " by " + book.authorName);
			System.out.println("\n------------------------------------------------------\n");
		}
		System.out.println("    **** Press enter to return to the menu ****");
		String exit = Main.input.nextLine();
		return exit;
	}

	public static String displayFavourites(User user, Book[] newBooks, Book[] favouriteBooks, Book[] completedBooks) {

		System.out.println("\n********** Your Favourite Books **********\n");
		System.out.println("\n------------------------------------------------------\n");
		for (Book book : favouriteBooks) {

			System.out.println("    " + book.bookName + " by " + book.authorName);
			System.out.println("\n------------------------------------------------------\n");
		}
		System.out.println("    **** Press enter to return to the menu ****");
		String exit = Main.input.nextLine();
		return exit;
		
	}

	public static String displayCompletedBooks(User user, Book[] newBooks, Book[] favouriteBooks, Book[] completedBooks) {

		System.out.println("\n********** Your Completed Books **********\n");
		System.out.println("\n------------------------------------------------------\n");
		for (Book book : completedBooks) {

			System.out.println("    " + book.bookName + " by " + book.authorName);
			System.out.println("\n------------------------------------------------------\n");
		}
		System.out.println("    **** Press enter to return to the menu ****");
		String exit = Main.input.nextLine();
		return exit;
	}
	
	public static String bookSearch(Book[] allBooks) {

		System.out.println("\nPlease enter the book ID");
		boolean result = false;
		while (result == false) {
			
			String bookIdSearch = Main.input.nextLine();
			int idSearch = Integer.parseInt(bookIdSearch);
			Book searchResult = null;

			for(Book el : allBooks) {
				if(el.bookId == (idSearch)) {
				searchResult = el;
					
				}
				else {
					continue;
				}
				
				
			}
			
			if (searchResult == null) {
				System.out.println("No current results for this search.");
			}
			else {
				result = true;
				System.out.println("******* Search Result *******");
				System.out.println("\n------------------------------------------------------\n");
				System.out.println("Book ID: " + searchResult.bookId);
				System.out.println("\nName: " + searchResult.bookName);
				System.out.println("\nAuthor: " + searchResult.authorName);
				System.out.println("\nDescription: " + searchResult.description);
				System.out.println("\n------------------------------------------------------\n");
			}
			
			System.out.println("    **** Press enter to return to the menu ****");

			
		}
		
		String exit = Main.input.nextLine();
		
		return exit;
	}
	
    public static void logOff() {
		System.out.println("Successfully logged out.");
	}
}

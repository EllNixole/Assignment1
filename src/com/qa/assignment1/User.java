package com.qa.assignment1;

import java.util.Scanner;

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

	static boolean signIn() {

		

		boolean loggedIn = false;
		int loginAttemptNo = 0;

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
			} else {
				loginAttemptNo++;
				if (loginAttemptNo >= 5) {
					System.out.println("Too many unsuccessful login attempts. Try again later.");
					break;
				}
				System.out.println("Username or password incorrect. Please try again.");

			}

		}
		
		return loggedIn;

	}
	
	public static void displayMenu(User user, Book[] newBooks, Book[] favouriteBooks, Book[] completedBooks) {
		
		
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
		
		if(search.toUpperCase().equals("L")) {
			displayLibrary(user, user.newBooks, user.favouriteBooks, user.completedBooks);
			
		}
		else if(search.toUpperCase().equals("N")) {
			displayNewBooks(user, user.newBooks, user.favouriteBooks, user.completedBooks);
			
		}
		else if(search.toUpperCase().equals("F")) {
			displayFavourites(user, user.newBooks, user.favouriteBooks, user.completedBooks);
			
		}
		else if(search.toUpperCase().equals("C")) {
			displayCompletedBooks(user, user.newBooks, user.favouriteBooks, user.completedBooks);
			
			
		}
		else if(search.toUpperCase().equals("S")) {
			bookSearch(bookId);
			
			
		}
		else {
			System.out.println("Unknown request. Try again.");
			displayMenu(user, user.newBooks, user.favouriteBooks, user.completedBooks);
			
		}
		
		}
	

	public static void displayLibrary(User user, Book[] newBooks, Book[] favouriteBooks, Book[] completedBooks) {
		
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
			
			System.out.println("\nTo exit to main menu type 'E'");
			
			boolean onMenu = true;
			while( onMenu == true) {
				
				String exit = Main.input.nextLine();
			  
				if(exit.toUpperCase().equals("E")) {
				  onMenu = false;
				  User.displayMenu(user, newBooks, favouriteBooks, completedBooks);
			  }
			  
				else {
				System.out.println("Unknown request");
			  }
			  
			}
		}

	}
	
	public static void displayNewBooks(User user, Book[] newBooks, Book[] favouriteBooks, Book[] completedBooks) {
		
		System.out.println("\n********** Your New Books **********\n");
		System.out.println("\n------------------------------------------------------\n");
		for (Book book : newBooks) {
			System.out.println("    " + book.bookName + " by " + book.authorName);
			System.out.println("\n------------------------------------------------------\n");
		}
		System.out.println("\nTo exit to main menu type 'E'");
		
		boolean onMenu = true;
		while( onMenu == true) {
			
			String exit = Main.input.nextLine();
		  
			if(exit.toUpperCase().equals("E")) {
			  onMenu = false;
			  User.displayMenu(user, newBooks, favouriteBooks, completedBooks);
		  }
		  
			else {
			System.out.println("Unknown request");
		  }
		  
		}
	}
	
	
    public static void displayFavourites(User user, Book[] newBooks, Book[] favouriteBooks, Book[] completedBooks) {
		
    	System.out.println("\n********** Your Favourite Books **********\n");
    	System.out.println("\n------------------------------------------------------\n");
    	for (Book book : favouriteBooks) {
			
			System.out.println("    " + book.bookName + " by " + book.authorName);
			System.out.println("\n------------------------------------------------------\n");
    	}
    	System.out.println("\nTo exit to main menu type 'E'");
		
		boolean onMenu = true;
		while( onMenu == true) {
			
			String exit = Main.input.nextLine();
		  
			if(exit.toUpperCase().equals("E")) {
			  onMenu = false;
			  User.displayMenu(user, newBooks, favouriteBooks, completedBooks);
		  }
		  
			else {
			System.out.println("Unknown request");
		  }
		  
		}
	}
	
    
    public static void displayCompletedBooks(User user, Book[] newBooks, Book[] favouriteBooks, Book[] completedBooks) {
		
    	System.out.println("\n********** Your Completed Books **********\n");
    	System.out.println("\n------------------------------------------------------\n");
    	for (Book book : completedBooks) {
			
			System.out.println("    " + book.bookName + " by " + book.authorName);
			System.out.println("\n------------------------------------------------------\n");
		}
    	System.out.println("\nTo exit to main menu type 'E'");
		
		boolean onMenu = true;
		while( onMenu == true) {
			
			String exit = Main.input.nextLine();
		  
			if(exit.toUpperCase().equals("E")) {
			  onMenu = false;
			  User.displayMenu(user, newBooks, favouriteBooks, completedBooks);
		  }
		  
			else {
			System.out.println("Unknown request");
		  }
		  
		}
	}
    
    public static void bookSearch(int book) {
    	
    	System.out.println("/nPlease enter the book ID");
    	
    	boolean result = false;
    	while( result == false){
    		Scanner no = new Scanner(System.in);
    		int bookIdSearch = no.nextInt();
    		
    		switch (bookIdSearch) {
    		case 1:
    			System.out.println("Book ID: " );
    			break;
    		case 2:
    			System.out.println();
    			break;
    		case 3:
    			System.out.println();
    			break;
    		case 4:
    			System.out.println();
    			break;
    		case 5:
    			System.out.println();
    			break;
    		case 6:
    			System.out.println();
    			break;
    		
    		
    		}
    	}
    }  	
}



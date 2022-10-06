package com.qa.assignment1;

import java.util.Scanner;

public class Main {
public static Scanner input = new Scanner(System.in);
	
public static void main(String[] args) {
		
		

		User user1 = new User("Dani", "danimass@gmail.com", "1234");
		Book book1 = new Book("The Bullet That Missed", "Richard Osman", "Book1 description here", 1);
		Book book2 = new Book("It Ends With Us", "Colleen Hoover", "Book2 description here", 2);
		Book book3 = new Book("One", "Jamie Oliver", "Book3 description here", 3);
		Book book4 = new Book("A Flicker In The Dark", "Stacy Willingham", "Book4 description here", 4);
		Book book5 = new Book("The Island Of Missing Trees", "Elif Shafak", "Book5 description here", 5);
		Book book6 = new Book("If We Were Villains", "M.L. Rio", "Book6 description here", 6);

		user1.newBooks = new Book[2];
		user1.newBooks[0] = book1;
		user1.newBooks[1] = book2;

		user1.favouriteBooks = new Book[2];
		user1.favouriteBooks[0] = book3;
		user1.favouriteBooks[1] = book4;

		user1.completedBooks = new Book[2];
		user1.completedBooks[0] = book5;
		user1.completedBooks[1] = book6;
		
		
		System.out.println();
		System.out.println("************************");
		System.out.println("Welcome to the bookshop!");
		System.out.println("************************");
		System.out.println();

		boolean loggedIn = User.signIn();
		
		if (loggedIn == true) {
			User.displayMenu(user1, user1.newBooks, user1.favouriteBooks, user1.completedBooks);
		} else {
			System.out.println("You need to log in to view your account");
		}
		input.close();

	}


}
package com.fusion.librarysystem.entity;

import java.util.Scanner;

public class MainLibraryApp {
	
	// issues- not able to insert title and author with spacing--> resolved while writing nextLine
	// issue while updating the book it is not taking input in space ans- cosole based hai isliye space
	//
	// after issuing the book is still showing in the display list.

	public static void main(String[] args) {
		LibraryManagementIMPL lib = new LibraryManagementIMPL();
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("                                       ");
		System.out.println("_______________________________________");
		do {
			System.out.println("===== Library Management System =====");
			System.out.println("1. Add Book");
			System.out.println("2. Display Books");
			System.out.println("3. Remove Book");
			System.out.println("4. Update Book");
			System.out.println("5. Search Book");
			System.out.println("6. Issue Book");
			System.out.println("7. Return Book");
			System.out.println("8. Exit");
			System.out.println("");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Title: ");
				String title = sc.nextLine();
				System.out.print("Enter Author: ");
				String author = sc.nextLine();
				lib.addBook(new Book(id, title, author));
				break;
			case 2:
				lib.displayBooks();
				break;
			case 3:
				System.out.print("Enter ID to remove: ");
				lib.removeBook(sc.nextInt());
				break;
			case 4:
				System.out.print("Enter ID: ");
				int uid = sc.nextInt();
				System.out.print("New Title: ");
				String utitle = sc.next();
				System.out.print("New Author: ");
				String uauthor = sc.next();
				lib.updateBook(new Book(uid, utitle, uauthor));
				break;
			case 5:
				System.out.print("Enter ID to search: ");
				lib.searchBook(sc.nextInt());
				break;
			case 6:
				System.out.print("Enter ID to issue: ");
				lib.issueBook(sc.nextInt());
				break;
			case 7:
				System.out.print("Enter ID to return: ");
				lib.returnBook(sc.nextInt());
				break;
			case 8:
				System.out.println("Thank you!");
				break;
			default:
				System.out.println("Invalid choice!");
			}
		} while (ch != 8);

	}

}

package com.fusion.librarysystem.entity;

public interface LibraryManagement {

	// Adding book one by one method
	void addBook(Book b);

	// we created an abstract method for displaying book
	void displayBooks();

	// method for removing book
	void removeBook(int id);

	// method for updating a book
	void updateBook(Book b);

	// method for searching a book
	void searchBook(int id);

	// method for issuing a book
	void issueBook(int id);

	// method for returning a book
	void returnBook(int id);
}

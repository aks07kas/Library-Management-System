package com.fusion.librarysystem.entity;

import java.util.ArrayList;
import java.util.ListIterator;


public class LibraryManagementIMPL implements LibraryManagement {
	ArrayList<Book> books = new ArrayList<>();

	@Override
	public void addBook(Book b) {
		if (books.add(b)) {
			System.out.println("");
			System.out.println("Book has been added successfully...");
		} else {
			System.out.println("Failed...");
		}

	}

	@Override
	public void displayBooks() {
		for (Book b : books) {
			System.out.println("Book ID: "+b.getId()); 
			System.out.println("Book Title: "+b.getTitle());
			System.out.println("Book Author: " +b.getAuthor());
			System.out.println("");
		}

	}

	@Override
	public void removeBook(int id) {
		boolean status = false;
		ListIterator<Book> ir = books.listIterator();
		while (ir.hasNext()) {
			Book b = ir.next();
			if (b.getId() == id) {
				ir.remove();
				status = true;
			}
		}
		if (status) {
			System.out.println("Book removed for ID " + id);
		} else {
			System.out.println("Book not found with ID " + id);
		}
	}

	@Override
	public void updateBook(Book b) {
			boolean setstatus = false;
			ListIterator<Book> ir1 = books.listIterator();
			while (ir1.hasNext()) {
				Book b1 = ir1.next();
				if (b1.getId() == b.getId()) {
					b1.setTitle(b.getTitle());
					b1.setAuthor(b.getAuthor());
					setstatus = true;
				}
			}
			if (setstatus) {
				System.out.println("Book updated successfully");
			} else {
				System.out.println("Book not found");
			}
	}

	@Override
	public void searchBook(int id) {
		boolean found = false;
		for (Book b : books) {
			if (b.getId() == id) {
				System.out.println("Book Found: ID=" + b.getId() + ", Title=" + b.getTitle() + ", Author=" + b.getAuthor());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No book found with ID: " + id);
		}
	}


	@Override
	public void issueBook(int id) {
	    boolean issued = false;

	    for (Book b : books) {
	        if (b.getId() == id) {
	            issued = true;
	            if (b.isIssued()) {
	                System.out.println("Book is already issued.");
	            } else {
	                b.setIssued(true);
	                System.out.println("Book issued successfully for ID " + id);
	            }
	            break;
	        }
	    }

	    if (!issued) {
	        System.out.println("Book not found with ID: " + id);
	    }
	}


	@Override
	public void returnBook(int id) {
	    boolean returned = false;

	    for (Book b : books) {
	        if (b.getId() == id) {
	            returned = true;
	            if (b.isIssued()) {
	                b.setIssued(false);
	                System.out.println("Book returned successfully for ID " + id);
	            } else {
	                System.out.println("Book was not issued.");
	            }
	            break;
	        }
	    }

	    if (!returned) {
	        System.out.println("Book not found with ID: " + id);
	    }
	}


}

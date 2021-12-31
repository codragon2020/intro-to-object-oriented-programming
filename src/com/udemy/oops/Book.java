package com.udemy.oops;

public class Book {

	// state
	private int noOfCopies;

	// behavior

	void countCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void openBook() {
		System.out.println("You have opened the book");
	}
}

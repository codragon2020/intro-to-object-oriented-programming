package com.udemy.oops;

public class Book {

	// state
	private int noOfCopies;

	// behavior

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies >= 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNoOfCopies(int howMany) {
		setNoOfCopies(this.noOfCopies + howMany);
	}

	public void decreaseNoOfCopies(int howMany) {
		setNoOfCopies(this.noOfCopies - howMany);
	}

	void openBook() {
		System.out.println("You have opened the book");
	}
}

package com.udemy.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.openBook();
		effectiveJava.openBook();
		cleanCode.openBook();

		artOfComputerProgramming.countCopies(4000);
		effectiveJava.countCopies(3000);
		cleanCode.countCopies(2000);

		artOfComputerProgramming.countCopies(5000);
		effectiveJava.countCopies(4000);
		cleanCode.countCopies(3000);
	}

}

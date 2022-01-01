package com.udemy.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.openBook();
		effectiveJava.openBook();
		cleanCode.openBook();

		artOfComputerProgramming.setNoOfCopies(4000);
		effectiveJava.setNoOfCopies(3000);
		cleanCode.setNoOfCopies(2000);

		artOfComputerProgramming.setNoOfCopies(5000);
		effectiveJava.setNoOfCopies(4000);
		cleanCode.setNoOfCopies(3000);

		System.out.println(cleanCode.getNoOfCopies());

		cleanCode.increaseNoOfCopies(1000);
		System.out.println(cleanCode.getNoOfCopies());

	}

}

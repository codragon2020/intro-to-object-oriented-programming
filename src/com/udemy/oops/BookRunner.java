package com.udemy.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.openBook();

		effectiveJava.openBook();

		cleanCode.openBook();
	}

}

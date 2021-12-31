package com.udemy.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book art_of_computer_programming = new Book();
		Book effective_java = new Book();
		Book clean_code = new Book();

		art_of_computer_programming.openBook();

		effective_java.openBook();

		clean_code.openBook();
	}

}

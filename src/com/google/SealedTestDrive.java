package com.google;

/**
 * The main class to run or test the sealed class
 */
public class SealedTestDrive {

	public static void main(String[] args) {
		Human h1 = new Anjali();
		Human h2 = new Manish();
		Human h3 = new Vertika();
//		Human h4 = new Lucifer();
		
		h1.printName();
		h2.printName();
		h3.printName();
//		h4.printName();
	}

}

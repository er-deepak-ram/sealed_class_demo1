package com.google;

/**
 * @author Deepak
 */

/** If any class other than Manish, Vartika, and Anjali tries to inherit from the Human class, 
 * it will cause a <b>compiler error.</b>
 * <br>
 * It will throw IncompatibleClassChangeError
 */

//TODO: This class should be deleted for running the application.
public non-sealed class Lucifer extends Human {

	@Override
	public void printName() {
		System.out.println("I'm not a Human, but trying to act as a human");
	}
}

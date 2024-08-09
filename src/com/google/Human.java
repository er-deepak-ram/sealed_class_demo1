package com.google;

/**
 * @author Deepak
 */

/**
 * sealed classes give us the privilege of controlling which classes or models can implement 
 * or extend that interface or class respectively.
 * <b>sealed:</b> This keyword is used to make a Java class sealed Java class, add the sealed modifier to its declaration.
 * <b>permits:</b> This keyword are placed to indicate the classes which are permitted for the given sealed class.
 */
public sealed class Human permits Manish, Vertika, Anjali{
	
	public void printName() {
		System.out.println("Default");

	}

}

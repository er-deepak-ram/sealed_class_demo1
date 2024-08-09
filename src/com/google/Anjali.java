package com.google;

/**
 * @author Deepak
 */

/** Child classes of a sealed class must be either <i>sealed, non-sealed or final</i>.
 */
public non-sealed class Anjali extends Human {

	/**
	 * This method simply printing the Human's name as 'Anjali Arora'
	 * */
	@Override
	public void printName() {
		System.out.println("Anjali Arora");
	}
}

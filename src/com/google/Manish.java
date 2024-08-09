package com.google;

/**
 * @author Deepak
 */

/** Child classes of a sealed class must be either <i>sealed, non-sealed or final</i>.
 */
public non-sealed class Manish extends Human {
	
	/**
	 * This method simply printing the Human's name as 'Manish Sharma'
	 * */
	@Override
	public void printName() {
		System.out.println("Manish Sharma");
	}
}

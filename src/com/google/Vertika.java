package com.google;

/**
 * @author Deepak
 */

/** Child classes of a sealed class must be either <i>sealed, non-sealed or final</i>.
 */
public non-sealed class Vertika extends Human {

	/**
	 * This method simply printing the Human's name as 'Vertika Shetty'
	 * */
	@Override
	public void printName() {
		System.out.println("Vertika Shetty");
	}
}

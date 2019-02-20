/*
 * @author Momen Abdelkarim
 * ClassID: 301
 * Description: This file, Calculator.java, contains one class,
 * Calculator, that contains the necessary constructor and methods to perform
 * common mathematical operations such as adding, subtraction, multiplying,
 * dividing, and getting the result. This class also contains a method that can
 * print the history of issued calculator commands.
 */

package cse360assign2;

public class Calculator {

	private int total;

	/**
	 * Sole constructor. Initializes the total (of the calculations) to 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}

	/**
	 * Returns the total (result) of issued calculations.
	 * @return the total after the issued calculations
	 */
	public int getTotal () {
		return total;
	}

	/**
	 * Adds an integer to the total (of the issued calculations so far) stored in
	 * the 'total' variable.
	 * @param value the integer, taken from user input, that is to be added to
	 *                 the total.
	 */
	public void add (int value) {
		total = total + value;
		
	}

	/**
	 * Subtracts an integer from the total (of the issued calculations so far)
	 * stored in the 'total' variable.
	 * @param value the integer, taken from user input, that is to be subtracted
	 *                 from the total.
	 */
	public void subtract (int value) {
		total = total - value;
		
	}

	/**
	 * Multiplies the total (from the issued calculations so far) stored in the
	 * total variable by an integer.
	 * @param value the integer, taken from user input, that multiplies the
	 *                 total.
	 */
	public void multiply (int value) {
		total = total * value;
		
	}

	/**
	 * Divides the total (from the issued calculations so far) stored in the
	 * total variable by an integer. If the given 'value' is 0, the total is set
	 * to zero.
	 * @param value the integer, taken from user input, that divides the
	 *                 total.
	 */
	public void divide (int value) {
		if (value != 0) {
			total = total/value;
		}
		else {
			total = 0;
		}
	}

	/**
	 * In practice, returns the history of previously issued calculations,
	 * starting from 0 to the last calculation.
	 * @return 	an empty string for now
	 */
	public String getHistory () {
		return "";
	}
}

package problems.problem15;

import java.math.BigInteger;

public class LatticePaths {
	/*
	 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
	 * 
	 * How many such routes are there through a 20×20 grid?
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		// any path must have 40 moves (20 right and 20 down); use the combinations formula (nCr = n!/(r!(n-r)!))
		int n = 40; // number of objects (moves) in the set is 40
		int r = 20; // number of choosing objects (right or down moves) in the set is 20
		BigInteger nFact = factorial(n); // initializes the factorial of n
		BigInteger rFact = factorial(r); // initializes the factorial of r
		BigInteger nMinusRFact = factorial(n-r); // initializes the factorial of n-r
		System.out.println(nFact.divide(rFact.multiply(nMinusRFact))); // print nCr (the number of combinations) according to the combinations formula
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
	
	public static BigInteger factorial(int input) { // method to return the factorial of an integer input (BigInteger is used because long is too small)
		BigInteger fact = new BigInteger("1"); // initializes the factorial variable, to be multiplied below
		for(int i = input; i > 1; i--) { // counts backwards from the input to 2 (multiplying by 1 is redundant)
			BigInteger currentNumber = new BigInteger(Integer.toString(i)); // changes the current iteration in the for loop from an int to a BigInteger
			fact = fact.multiply(currentNumber); // multiplies the current product by the current iteration
		}
		return fact; // once the loop has completed, return the completed factorial
	}
}

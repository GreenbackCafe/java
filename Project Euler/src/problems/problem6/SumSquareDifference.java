package problems.problem6;

public class SumSquareDifference {
	/*
	 * The sum of the squares of the first ten natural numbers is,
	 * 1^2 + 2^2 + ... + 10^2 = 385
	 * The square of the sum of the first ten natural numbers is,
	 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
	 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
	 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		int sumOfNaturalSquares = 0; // initializes the sum of the squares
		int sumOfNaturals = 0; // initializes the sum (to be squared later)
		for(int i = 1; i <= 100; i++) { // iterates through the natural numbers from 1 to 100
			sumOfNaturalSquares = sumOfNaturalSquares + (int)Math.pow(i, 2); // add the square of the current number to the sum of the squares (cast the square to an int because the java.lang.Math power function returns a double)
			sumOfNaturals = sumOfNaturals + i; // add the current number to the normal sum (to be squared after the loop)
		}
		int squareOfSum = (int)Math.pow(sumOfNaturals, 2); // square the sum of natural numbers from 1 to 100 (cast the square to an int because the java.lang.Math power function returns a double)
		System.out.println(Math.abs(sumOfNaturalSquares - squareOfSum)); // print the difference (absolute value) between the sum of the squares and the square of the sum (of natural numbers from 1 to 100)
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
}

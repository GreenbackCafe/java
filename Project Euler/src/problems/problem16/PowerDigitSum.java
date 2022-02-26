package problems.problem16;

import java.math.BigInteger;

public class PowerDigitSum {
	/*
	 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 * What is the sum of the digits of the number 2^1000?
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		BigInteger twoToThe25 = new BigInteger(Integer.toString((int) Math.pow(2, 25))); // sets a BigInteger equal to 2^25 (by calculating the double 2^25, casting it to int, and converting it to a String to put in the BigInteger constructor)
		BigInteger twoToThe1000 = new BigInteger("1"); // initializes the BigInteger representing 2^1000
		for(int i = 0; i < 1000/25; i++) { // iterates through every partition of 25 in 1000 (1000/25, which is 40)
			twoToThe1000 = twoToThe1000.multiply(twoToThe25); // multiplies twoToThe1000 by 2^25 (40 times, resulting in 2^1000)
		}
		
		String twoToThe1000String = twoToThe1000.toString(); // converts twoToThe1000 to a String so it can be split into characters
		int sum = 0; // initializes the sum of the digits
		for(int i = 0; i < twoToThe1000String.length(); i++) { // iterates through every digit of the sum (every character in twoToThe1000String)
			sum = sum + Integer.parseInt(twoToThe1000String.substring(i,i+1)); // adds the current digit to the digit sum
		}
		System.out.println(sum); // prints the final sum of the digits of 2^1000
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
}

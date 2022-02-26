package problems.problem9;

public class SpecialPythagoreanTriplet {
	/*
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	 * a^2 + b^2 = c^2
	 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		outerloop: // label for the outer loop so it can be broken out of later
		// three nested for loops iterate through all combinations of 3 numbers from 1 to 998
		for(int a = 1; a <= 998; a++) { // iterates through numbers from 1 to 998 (a+b+c=1000 and all are natural numbers, so max value for any a b or c is 998 and min value is 1)
			for(int b = 1; b <= 998; b++) { // iterates through numbers from 1 to 998 for b, given an a-value
				for(int c = 1; c <= 998; c++) { // iterates through numbers from 1 to 998 for c, given an a-value and a b-value
					if(square(a) + square(b) == square(c)) { // if a^2 + b^2 = c^2
						if(a+b+c == 1000) { // and the sum of a, b, and c is 1000
							System.out.println(a + "^2 + " + b + "^2 = " + c + "^2"); // print a, b, and c, and illustrate that they are a Pythagorean triple
							System.out.println(a + "*" + b + "*" + c + " = " + a*b*c); // print the product of a, b, and c, and illustrate that it is the product
							break outerloop; // once the triple has been found, terminate the program (further iteration is unnecessary)
						}
					}
				}
			}
		}
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
	
	public static int square(int input) { // wrapper function for squaring an int
		return (int)Math.pow(input, 2); // use java.lang.Math power function to raise input to the power of 2, cast double output to int
	}
}

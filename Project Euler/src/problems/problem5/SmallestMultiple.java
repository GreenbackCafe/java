package problems.problem5;

public class SmallestMultiple {
	/*
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		int dividend = 20; // initializes the dividend variable (tested and incremented below)
		while(true) { // will repeat until number is found
			if(dividend % 11 == 0 && dividend % 12 == 0 && dividend % 13 == 0 && dividend % 14 == 0 && dividend % 15 == 0 && dividend % 16 == 0 && dividend % 17 == 0 && dividend % 18 == 0 && dividend % 19 == 0 && dividend % 20 == 0) { // if the current dividend is divisible by the numbers 11-20 (and the numbers 1-10, by extension)
				System.out.println(dividend); // then print the dividend
				break; // and terminate the loop
			}
			dividend = dividend + 20; // increment the dividend by 20 after every test (inefficient to increment by less because then intervening numbers would not be divisible by 20, the largest divisor)
		}
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
}

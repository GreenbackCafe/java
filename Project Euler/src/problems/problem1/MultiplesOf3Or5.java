package problems.problem1;

public class MultiplesOf3Or5 {
	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * Answer: 233168
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		int sum = 0; // increasing sum, beginning at 0
		for(int i = 0; i < 1000; i++) { // iterates through every number from 0 to 999
			if(i % 3 == 0 || i % 5 == 0) { // if the current i is divisible by 3 and/or 5
				sum = sum + i; // add i to the sum
			}
		}
				
		System.out.println(sum); // print the final sum (once the for loop has completed)
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
}

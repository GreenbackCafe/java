package problems.problem2;

public class EvenFibonacciNumbers {
	/*
	 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
	 *     1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
	 * Answer: 4613732
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		int num1 = 1;
		int num2 = 2;
		int num3 = num1 + num2; // establishes a sequence of three numbers, starting with the first three of the Fibonacci sequence
		int sum = 2; // establishes the sum, which starts at 2 because 2 is skipped in the method used below
		while(num3 <= 4000000) { // as long as the third number in the current sequence of three numbers (the sum of the last two numbers) does not exceed 4 million
			if(num3 % 2 == 0) { // if the sum of the last two numbers is even
				sum = sum + num3; // add it to the total sum
			}
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2; // move the sequence of three numbers up by 1 in the Fibonacci sequence
		}
				
		System.out.println(sum); // print the total sum once the while loop is complete
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
}

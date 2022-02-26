package problems.problem7;

public class _10001stPrime {
	/*
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10 001st prime number?
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		int currentNumber = 3; // initialize the current number, start at 3 so it can be incremented by 2
		int counter = 1; // counter starts at 1 because 2 is already counted
		while(counter < 10001) { // while less than 10001 prime numbers have been counted
			if(isPrime(currentNumber)) { // if the current number is prime
				counter = counter + 1; // then increment the number of prime numbers
			}
			currentNumber = currentNumber + 2; // add 2 to the current number (even numbers are not prime, so they can be skipped)
		}
		System.out.println(currentNumber - 2); // print the 10001st prime number (subtract 2 because it was added at the end of the while loop)
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
	
	public static boolean isPrime(int input) { // method to determine whether a number is prime
		if(input % 2 == 0) { // if the input is divisible by 2
			return false; // then the input is not prime
		}
		if(input == 3 || input == 5) { // if the input is 3 or 5 (to make sure the for loop works, i.e. half of the input is not less than 3)
			return true; // then the input is prime
		}
		for(int i = 3; i <= (input/2); i = i + 2) { // iterates from 3 to half of the input (a number is only divisible by numbers that are half of it or less); even numbers can be skipped for efficiency (if the input is not divisible by 2, determined above, then it is not divisible by even numbers either)
			if(input % i == 0) { // if the input is divisible by the current number (anything from 2 to half of the input)
				return false; // then the input is not prime
			}
		}
		return true; // if no numbers from 2 to half of the input divide the input, then the input is prime
	}
}

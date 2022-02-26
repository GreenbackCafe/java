package problems.problem10;

public class SummationOfPrimes {
	/*
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * Find the sum of all the primes below two million.
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		long sum = 2; // initialize the sum (to be added to later), 2 is already added
		System.out.println("2"); // print 2 to illustrate that it has been counted
		for(int i = 3; i < 2000000; i = i + 2) { // iterate through odd numbers from 3 to 2000000 (2 million), even numbers can be skipped because they are not prime (divisible by 2)
			if(isPrime(i)) { // if the current number is prime
				sum = sum + i; // then add it to the sum of primes
				System.out.println(i); // and print the current prime number (to illustrate that the program is working since it takes a while)
			}
		}
		System.out.println("The sum of all prime numbers below two million is " + sum); // after all prime numbers below two million have been added, print the sum of the primes
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}

	private static boolean isPrime(int input) { // determines whether an odd number input is prime (even numbers are skipped when this function is called)
		if(input == 3 || input == 5) return true; // if the input is 3 or 5, then it is prime
		for(int divisor = 3; divisor <= (Math.sqrt(input)); divisor = divisor + 2) { // iterate through odd numbers from 3 to the square root of the input (numbers between the square root of the input and half the input may be factors of the input, but if they are then numbers below sqrt(input) are also factors)
			if(input % divisor == 0) return false; // if the input is divisible by a number from 3 to half the input, then it is not prime
		}
		return true; // if the input is not divisible by a number from 3 to half the input, then it is prime
	}
}

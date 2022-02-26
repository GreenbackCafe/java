package problems.problem3;

public class LargestPrimeFactor {
	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143?
	 * Answer: 6857
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		long bigNumber = 600851475143L; // the number given in the problem (too large for int data type, so long must be used)
		for(long bigNumberDivisor = 1; bigNumberDivisor <= (bigNumber/2); bigNumberDivisor = bigNumberDivisor + 2) { // iterates from 1 to half of 600851475143 (a number is only divisible by numbers that are half of it or less); even numbers can be skipped for efficiency (they are not prime)
			if(bigNumber % bigNumberDivisor == 0 && isPrime(bigNumberDivisor)) { // if 600851475143 is divisible by the current divisor (determined by the for loop), and the current divisor is prime
				System.out.println(bigNumberDivisor); // print the current divisor because it is a prime factor of 600851475143
			}
		}
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
	
	public static boolean isPrime(long input) { // method to determine whether a number is prime
		if(input % 2 == 0) { // if the input is divisible by 2
			return false; // then the input is not prime
		}
		for(long i = 3; i <= (input/2); i = i + 2) { // iterates from 3 to half of the input (a number is only divisible by numbers that are half of it or less); even numbers can be skipped for efficiency (if the input is not divisible by 2, determined above, then it is not divisible by even numbers either)
			if(input % i == 0) { // if the input is divisible by the current number (anything from 2 to half of the input)
				return false; // then the input is not prime
			}
		}
		return true; // if no numbers from 2 to half of the input divide the input, then the input is prime
	}
}

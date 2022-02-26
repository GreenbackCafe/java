package problems.problem14;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestCollatzSequence {
	/*
	 * The following iterative sequence is defined for the set of positive integers:
	 * 		n --> n/2 (n is even)
	 * 		n --> 3n + 1 (n is odd)
	 * Using the rule above and starting with 13, we generate the following sequence:
	 * 		13 --> 40 --> 20 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1
	 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
	 * Which starting number, under one million, produces the longest chain?
	 * NOTE: Once the chain starts the terms are allowed to go above one million.
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		Map<Integer, Integer> startingNumbersAndChainCounts = new HashMap<Integer, Integer>(); // initializes a hashmap to pair starting numbers with the number of numbers in their Collatz sequences
		
		for(int startingNumber = 1; startingNumber < 1000000; startingNumber++) { // iterates through all starting numbers from 1 to 999999
			long currentNumber = startingNumber; // initializes the current number in the chain as the starting number (it is a long rather than an int to deal with larger numbers that may occur in the sequence)
			int length = 1; // the length of the sequence starts at 1 (sequence starts with startingNumber)
			while(currentNumber != 1) { // while the current number in the sequence is not 1 (i.e. the Collatz sequence is not yet completed)
				if(currentNumber % 2 == 0) { // if the current number is even
					currentNumber = currentNumber/2; // then the next number is the current number divided by 2 (n --> n/2 when n is even)
					length++; // increments the length
				} else { // if the current number is odd
					currentNumber = ((3*currentNumber) + 1)/2; // then the next number is the current number times 3 plus 1 (n --> 3n + 1 when n is odd), which is always even so the number after that is divided by 2
					length = length + 2; // increments the length by 2 since 2 numbers were counted
				}
			}
			//System.out.println(startingNumber + " " + length); // prints the starting number and the length of its Collatz sequence in a pair
			startingNumbersAndChainCounts.put(startingNumber, length); // add the starting number and the length of its Collatz sequence to the hash map
		}
		
		// use hashmap method to find the startingNumber or startingNumbers (keys) that are associated with the max length (value)
		int maxLength = Collections.max(startingNumbersAndChainCounts.values()); // the max length of all the Collatz sequences is equal to the max value in the list of hashmap values
		for(int key : startingNumbersAndChainCounts.keySet()) { // iterates through every key in the set of hashmap keys
			if(startingNumbersAndChainCounts.get(key) == maxLength) { // if the value associated with the current key is equal to the max length
				System.out.println(key); // then print the current key
			}
		}
		
		//System.out.println("Done!"); // once the program has finished, say so
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
}

package problems.problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPalindromeProduct {
	/*
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 * Answer: 
	 */
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		List<Integer> palindromes = new ArrayList<Integer>(); // create a list of palindromes to add to
		for(int i = 999; i >= 100; i--) { // iterate through all combinations of two 3-digit numbers
			for(int j = i; j >= 100; j--) {
				int product = i*j; // the product of the current two 3-digit numbers
				String productString = String.valueOf(product); // the product, represented by a String so that the individual digits can be more easily determined
				int productLength = productString.length(); // length of the current product (in digits)
				if(isPalindrome(productString, productLength)) { // if the current product is a palindrome
					palindromes.add(product); // add the current product (palindrome) to the list of palindromes
				}
			}
		}
		
		System.out.println(Collections.max(palindromes)); // print max value in the list of palindromes (highest palindrome)
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
	
	public static boolean isPalindrome(String input, int length) { // method to determine whether a 5- or 6-digit number (the product) is a palindrome (the product can only be 5 or 6 digits because 100*100=10000, the smallest, and 999*999=998001, the largest product of two 3-digit numbers)
		if(length == 5 && input.charAt(0) == input.charAt(4) && input.charAt(1) == input.charAt(3)) { // if the length is 5, the first and fifth characters match, and the second and fourth characters match
			return true; // then the number is a palindrome
		}
		if(length == 6 && input.charAt(0) == input.charAt(5) && input.charAt(1) == input.charAt(4) && input.charAt(2) == input.charAt(3)) { // if the length is 6, the first and sixth characters match, the second and fifth characters match, and the third and fourth characters match
			return true; // then the number is a palindrome
		}
		else { // if none of the above are true (the product can only have 5 or 6 digits)
			return false; // then the number is NOT a palindrome
		}
	}
}

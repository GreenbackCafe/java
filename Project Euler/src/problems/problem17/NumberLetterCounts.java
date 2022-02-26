package problems.problem17;

import java.util.HashMap;

public class NumberLetterCounts {
	/*
	 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
	 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
	 * 
	 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
	 */
	
	public static final int ONE_LETTERS = 3;
	public static final int TWO_LETTERS = 3;
	public static final int THREE_LETTERS = 5;
	public static final int FOUR_LETTERS = 4;
	public static final int FIVE_LETTERS = 4;
	public static final int SIX_LETTERS = 3;
	public static final int SEVEN_LETTERS = 5;
	public static final int EIGHT_LETTERS = 5;
	public static final int NINE_LETTERS = 4;
	public static final int TEN_LETTERS = 3;
	public static final int ELEVEN_LETTERS = 6;
	public static final int TWELVE_LETTERS = 6;
	public static final int THIRTEEN_LETTERS = 8;
	public static final int FOURTEEN_LETTERS = 8;
	public static final int FIFTEEN_LETTERS = 7;
	public static final int SIXTEEN_LETTERS = 7;
	public static final int SEVENTEEN_LETTERS = 9;
	public static final int EIGHTEEN_LETTERS = 8;
	public static final int NINETEEN_LETTERS = 8;
	public static final int TWENTY_LETTERS = 6;
	public static final int THIRTY_LETTERS = 6;
	public static final int FORTY_LETTERS = 5;
	public static final int FIFTY_LETTERS = 5;
	public static final int SIXTY_LETTERS = 5;
	public static final int SEVENTY_LETTERS = 7;
	public static final int EIGHTY_LETTERS = 6;
	public static final int NINETY_LETTERS = 6;
	public static final int HUNDRED_LETTERS = 7;
	public static final int THOUSAND_LETTERS = 8;
	public static final int AND_LETTERS = 3;
	
	static HashMap<Integer, Integer> oneThroughTenLetters = new HashMap<Integer, Integer>();
	static int letterSum = 0;
	
	public static void main(String[] args) {
		long begin = System.currentTimeMillis(); // stores the start time
		
		oneThroughTenLetters.put(1, ONE_LETTERS);
		oneThroughTenLetters.put(2, TWO_LETTERS);
		oneThroughTenLetters.put(3, THREE_LETTERS);
		oneThroughTenLetters.put(4, FOUR_LETTERS);
		oneThroughTenLetters.put(5, FIVE_LETTERS);
		oneThroughTenLetters.put(6, SIX_LETTERS);
		oneThroughTenLetters.put(7, SEVEN_LETTERS);
		oneThroughTenLetters.put(8, EIGHT_LETTERS);
		oneThroughTenLetters.put(9, NINE_LETTERS);
		oneThroughTenLetters.put(10, TEN_LETTERS);
		oneThroughTenLetters.put(11, ELEVEN_LETTERS);
		oneThroughTenLetters.put(12, TWELVE_LETTERS);
		oneThroughTenLetters.put(13, THIRTEEN_LETTERS);
		oneThroughTenLetters.put(14, FOURTEEN_LETTERS);
		oneThroughTenLetters.put(15, FIFTEEN_LETTERS);
		oneThroughTenLetters.put(16, SIXTEEN_LETTERS);
		oneThroughTenLetters.put(17, SEVENTEEN_LETTERS);
		oneThroughTenLetters.put(18, EIGHTEEN_LETTERS);
		oneThroughTenLetters.put(19, NINETEEN_LETTERS);
		
		for(int hundreds = 0; hundreds < 10; hundreds++) {
			for(int i = 1; i <= 19; i++) {
				letterSum = letterSum + oneThroughTenLetters.get(hundreds);
				System.out.println(letterSum);
			}
		}
		
		letterSum = letterSum + ONE_LETTERS + THOUSAND_LETTERS;
		
		System.out.println(letterSum);
		
		/*for(int i = 1; i <= 19; i++) {
			for(int hundreds = 0; hundreds < 10; hundreds++) {
				letterSum = letterSum + oneThroughTenLetters.get(i);
			}
		}
		
		for(int i = 20; i <= 29; i++) {
			letterSum = letterSum + 
		}*/
		
		System.out.println(letterSum);
		
		long end = System.currentTimeMillis(); // stores the end time
		System.out.println(end-begin + "ms"); // prints the time taken for the program to execute
	}
	
	/*private static int countNumberLetters(int input) {
		int inputLength = Integer.toString(input).length();
		switch(inputLength) {
		case 3:
			
		case 2:
			
		case 1:
			if(input == 1) return ONE_LETTERS;
			
		case 4:
			return ONE_LETTERS + THOUSAND_LETTERS;
		default:
			throw new NumberFormatException();
		}
	}*/
}

/*
 * URLify: Write a method to replace all spaces in a string with '%20':
 * 
 * You may assume that the string has sufficient space at the end to hold
 *  the additional characters, and that you are given the "true" length of
 *  the string. 
 *  
 *  (Note: If implementing in Java, please use a character array so that 
 *  you can perform this operation in place.)
 *
 *  
EXAMPLE
Input:  "Mr John Smith    ", 13
Output: "Mr%20John%20Smith"
Hints: #53, #118

#53. l.3 It's often easiest to modify strings by going from the end of the string to the beginning.

#118. 1.3 You might find you need to know the number of spaces. Can you just count them?


 */


package com.neojal.jctci.arraysandstrings;

public class URLify {

	public static void main(String[] args) {
		//includes the extra space at the end.
		String s = "Mr John Smith Goes To        ";
		char[] input = s.toCharArray();
		//true size of the string: 13
		int inputTrueSize = s.trim().length();
		
		System.out.println( urlify(input, inputTrueSize) );
		
		
	}

	private static char[] urlify(char[] input, int inputTrueSize) {
		int lastIndex=input.length-1;
		int lastCharIndex=inputTrueSize-1;
		
		do {
			for(int i=lastCharIndex; input[i]!=' '; i--,lastIndex--, lastCharIndex--) {
				input[lastIndex]=input[i];
				input[i]=' ';
				System.out.println(input);
			}
			lastCharIndex--;
			input[lastIndex--]='0';
			input[lastIndex--]='2';
			input[lastIndex--]='%';
			System.out.println(input);
		} while(lastCharIndex>1);
		
		
		return input;
	}

}

/*
 * 
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * Hints: 
 * 	#44 try a hash table 
 * 	#777 Could a bit vector be useful?
 *  #132 Can you solve it in O(N log N) time? What might a solution like that look like?
 * 
 */


package com.neojal.jctci.arraysandstrings;

import java.util.Scanner;

public class IsUnique {

	public static void main(String[] args) {
		System.out.println("Write a string to determine if has all unique chars: ");
		Scanner scanner = new Scanner(System.in);
		if(hasUniqueChars(scanner.nextLine())) {
			System.out.println("The string has unique chars!");
		} else {
			System.out.println("The string has no-unique chars!");
		}
	}
	
	public static boolean hasUniqueChars(String s) {
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}

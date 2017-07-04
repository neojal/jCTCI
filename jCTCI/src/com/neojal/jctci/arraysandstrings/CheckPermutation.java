/*
 * Check Permutation: 
 * Given two strings, write a method to decide if one is a permutation of the other.
 * 
 * Hints:
 *  
 * #7	Of course, you could convert the linked lists to integers, compute the sum, and then
convert it back to a new linked list. If you did this in an interview, your interviewer would
likely accept the answer, and then see if you could do this without converting it to a
number and back.
	 
 * #84	There is one solution that is 0 (N log N) time. Another solution uses some space, but
isO(N) time.

 * #722	Consider memorization to optimize the runtime. Think carefully about what exactly you
cache. What is the runtime? The runtime is closely related to the max size of the table.
	 
 * #737 You could also try using XOR.

 */

package com.neojal.jctci.arraysandstrings;

import java.util.ArrayList;

public class CheckPermutation {

	public static void main(String[] args) {
		String s1="abcd", s2="bcda", s3="abdc", s4="abcde", s5="xyab";
		
		/*
		 * Expected: true, true, false, false
		 */
		System.out.println( isPermutation(s1, s2) );
		System.out.println( isPermutation(s1, s3) );
		System.out.println( isPermutation(s1, s4) );
		System.out.println( isPermutation(s1, s5) );

	}

	/*
	 * 
	 */
	public static boolean isPermutation(String s1, String s2) {
		char input[] = s1.toCharArray();
		ArrayList<String> list = new ArrayList<>();
		
		list.add( String.valueOf(input[0]) );
		for(int i=1; i<input.length; i++) {
			list = permutation(list, input[i]);
		}
		
		System.out.println("Result, total elements (n!): "+list.size());
		for(String s: list) {
			//System.out.println( s );
			if(s.equals(s2)) {
				return true;
			}
		}
		return false;
	}
	
	private static ArrayList<String> permutation(ArrayList<String> list, char c) {
		ArrayList<String> res = new ArrayList<>();
		
		for(String s: list) {
			for(int i=0; i<=s.length(); i++) {
				StringBuilder sb = new StringBuilder(s);
				sb.insert(i, c);
				//System.out.println(sb.toString());
				res.add(sb.toString());
			}
		}
		return res;
	}
}

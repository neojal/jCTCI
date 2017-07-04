package com.neojal.jctci.arraysandstrings;

import java.util.ArrayList;

public class PermutationString {

	public static void main(String[] args) {
		char input[] = {'a','b','c','d'};
		ArrayList<String> list = new ArrayList<>();
		
		list.add( String.valueOf(input[0]) );
		for(int i=1; i<input.length; i++) {
			list = permutation(list, input[i]);
		}
		
		System.out.println("Result, total elements (n!): "+list.size());
		for(String s: list) {
			System.out.println( s );
		}
	}

	private static ArrayList<String> permutation(ArrayList<String> list, char c) {
		ArrayList<String> res = new ArrayList<>();
		
		for(String s: list) {
			for(int i=0; i<=s.length(); i++) {
				StringBuilder sb = new StringBuilder(s);
				sb.insert(i, c);
				System.out.println(sb.toString());
				res.add(sb.toString());
			}
		}
		return res;
	}
}

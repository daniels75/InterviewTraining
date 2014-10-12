package org.daniels.examples;

import java.util.Arrays;

public class StringPermutation {

	public static void main(String[] args) {
		System.out.println("result: " + firstSolution("abcdefg  ", "badcefg  "));
		System.out.println("result: " + secondSolution("abcdef", "badcef"));

	}
	
	private static boolean firstSolution(final String str1, final String str2){
		
		if (str1.length() != str2.length()){
			return false;
		}
		
		final char[] arr1 = str1.toCharArray();
		final char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		// first approach
		for (int i = 0; i < arr1.length; i++){
			if (arr1[i] != arr2[i]){
				return false;
			}
		}
		
		// second approach
//		if (!new String(arr1).equals(new String(arr2))){
//			return false;
//		}
		
		
		return true;
	}
	
	
	private static boolean secondSolution(final String str1, final String str2){
		
		if (str1.length() != str2.length()){
			return false;
		}
		
		final int[] charValues = new int[256];
		
		for (int i = 0; i < str1.length(); i++){
			final int value = str1.charAt(i);
			charValues[value]++;
		}
		
		
		final char[] str2Chars = str2.toCharArray();
		
		for (final char ch : str2Chars){
			if (--charValues[ch] < 0){
				return false;
			}
		}
		
		return true;
	}

}

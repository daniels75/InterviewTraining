package org.daniels.examples.str;

public class StringTests {

	public static void main(String[] args){
		final String str = "abcdefg";
		
		char[] dest = new char[10];
		
		str.getChars(0, str.length(), dest, 2);
		
		for (int i = 0; i < dest.length; i++){
			System.out.println(dest[i]);
		}
		
	}
}

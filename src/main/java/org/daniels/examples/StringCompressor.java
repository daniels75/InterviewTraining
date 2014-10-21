package org.daniels.examples;

public class StringCompressor {

	public static void main (String [] args) {
		final String initString = "aaa";
		System.out.println("compression: " + calculateCompression(initString));
		System.out.println(compressString(initString));
	}
	
	private static String compressString(final String initString){
		if (initString == null || initString.length()  < 2 ){ // aa == a2
			return initString;
		}
		final String compressedStr = compressStr(initString);
		
		return compressedStr.length() < initString.length() ? compressedStr : initString;
	}

	private static String compressStr(final String initString) {
		final StringBuilder builder = new StringBuilder();
		
		char oldChar = initString.charAt(0);
		int currentCharCount = 1;
		
		for (int i = 1; i < initString.length(); i++){
			final char currentChar = initString.charAt(i);
			if (currentChar != oldChar){
				builder.append(oldChar);
				builder.append(currentCharCount);
				
				oldChar = currentChar;
				currentCharCount = 1;
			}
			else {
				currentCharCount++;
			}
		}
		
		builder.append(oldChar).append(currentCharCount);
		
		return builder.toString();
	}
	
	private static int calculateCompression(final String initString) {
		if (initString == null || initString.isEmpty()){
			return 0;
		}
		
		char oldChar = initString.charAt(0);
		int currentCharCount = 1;
		int size = 0;
		
		for (int i = 1; i < initString.length(); i++){
			final char currentChar = initString.charAt(i);
			if (currentChar != oldChar){
				// one sign + length of sign's - e.g. aaaa = a4
				size += 1 + String.valueOf(currentCharCount).length();
				
				currentCharCount = 1;
				
				oldChar = currentChar;
			}
			else {
				currentCharCount++;
			}
		}
		
		size += 1 + String.valueOf(currentCharCount).length();
		
		return size;
		
	}
	
	
	private static int calculateCompressionBad(final String initString) {
		if (initString == null || initString.isEmpty()){
			return 0;
		}

		if (initString.length() == 1) {
			return 2;
		}
		
		char oldChar = initString.charAt(0);
		int currentCharCount = 1;
		int size = 0;
		
		for (int i = 1; i < initString.length(); i++){
			final char currentChar = initString.charAt(i);
			if (currentChar != oldChar){
				size += 1 + currentCharCount;
				
				currentCharCount = 1;
				
				oldChar = currentChar;
			}
			else {
				currentCharCount++;
			}
		}
		
		size += 1 + currentCharCount;
		
		return size;
		
	}
	
}
package org.daniels.examples;

public class StringSpaceReplacer {

	public static void main (String [] args){
		final String initStr = "Daniel Test Me   ";
		System.out.println(replaceToSpace(initStr));
	}
	
	public static String replaceToSpace(final String str) {
		int spaceCount = 0;
		for (int i = 0; i < str.length(); i++) {
			final char ch = str.charAt(i);
			if (ch == ' ') {
				spaceCount++;
			}
		}
		
		int totalSize = str.length() + spaceCount * 3 + 1;
		int j  = 0;
		char[] newtab = new char[totalSize];
		newtab[totalSize-1] = '\0';
		for (int i = 0; i < str.length(); i++) {
			final char ch = str.charAt(i);
			
			if (ch == ' ') {
				newtab[j++] = '%';
				newtab[j++] = '2';
				newtab[j++] = '0';
			}
			else {
				newtab[j++] = ch;
			}
		}
		
		System.out.println(spaceCount);
		
		return new String(newtab);
	}
}

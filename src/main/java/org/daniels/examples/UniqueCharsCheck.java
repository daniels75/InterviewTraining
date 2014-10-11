package org.daniels.examples;

public class UniqueCharsCheck {

	public static void main(String[] args) {
		firstSolution();
		secondSolution();
		
		arrayCopy("abcd".toCharArray());

	}

	private static void firstSolution() {
		final String str = "abcdeab";
		char[] tab = str.toCharArray();

		for (int i = 0; i < tab.length; i++) {
			final char ch = tab[i];
			if (i + 1 < str.length()) {
				final int foundIdx = str.indexOf(ch, i + 1);
				if (foundIdx >= 0) {
					System.out.println("found " + ch + " at index: " + foundIdx);
				}
			}
		}
	}
	
	
	private static void secondSolution(){
		
		final String str = "abcdabc";
		
		boolean[] tab = new boolean[256];
		
		for (int i = 0; i < str.length(); i++){
			final int charValue = str.charAt(i);
			//System.out.println("charValue: " + charValue);
			if (tab[charValue]){
				System.out.println("found not unique char: " + str.charAt(i));
				return;
			}
			tab[charValue] = true;
		}
		
	}

	private static void arrayCopy(char[] tab) {
		System.out.println(tab);
		char[] tab1 = new char[tab.length];
		System.arraycopy(tab, 0, tab1, 0, tab.length);
		System.out.println(tab1);
	}
}

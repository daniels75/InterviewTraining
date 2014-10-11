package org.daniels.examples;

public class DoubleCharacterCheck {

	public static void main(String[] args) {
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
}

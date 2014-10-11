package org.daniels.examples.str;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("abcdefg"));
	}

	private static String reverse(final String str) {
		final StringBuilder builder = new StringBuilder();
		final char[] tab = new char[str.length()];
		int j = 0;
		for (int i = str.length() -1; i >= 0; i--){
			builder.append(str.charAt(i));
			
			// another solution without StringBuilder
			tab[j] = str.charAt(i);
			j++;
		}
		
		System.out.println(tab);

		return builder.toString();
	}

}

package org.daniels.examples;

public class StringWithSpaces {

	public static void main(String[] args) {
		final String test = "test test";
		//System.out.println(replaceSpaces(test.toCharArray(), test.length()));
		test.substring(0, 3);
	}

	public static String replaceSpaces(char[] str, int length) {
		int spaceCount = 0, newLength, i;
		for (i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		newLength = length + spaceCount * 2;
		System.out.println("newLength: " + newLength + " str.length: " + str.length);
		str[newLength] = '\0';
		for (i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}

		return new String(str);
	}

}

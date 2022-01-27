package javabasicprogramms;

import java.util.Arrays;

public class StringAnagram {

	// to check if the two Strings are Anagram or not
	// example -CAT and ACT are two Anagram Strings

	public static boolean IsAnagram(String s1, String s2) {

		// remove all the spaces inside the String
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		if (str1.length() != str2.length()) {

			return false;

		} else {

			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);

		}

	}

	public static void main(String[] args) {

		System.out.println("if String is Anagram or not :" + IsAnagram("SILENT", "LISTEN"));

		System.out.println("if String is Anagram or not :" + IsAnagram("Silent", "Listen"));
		
		System.out.println("if String is Anagram or not :" + IsAnagram("Act	", "Cat"));
		
		System.out.println("if String is Anagram or not :" + IsAnagram("Lives", "Elvis"));
	}

}

package javapractice;

import org.apache.commons.lang3.StringUtils;

public class NumberofCharactersinsideWord {

	public static void main(String[] args) {

		String words = "My name is Jiten Kummar";

		// e - 2 , a - 2 , m - 4 times
		// 4 ways of doing it
		// CharArray - for loops
		// str.len -- charAt (i)
		// Apache Common String Utils.
		// use of JDK 8 - Stream Method

		// using charArray concept

		countNumberofOccurences(words, 'e');
		
		//using charAt - length method
		countNumberofCharacters(words, 'm');
		
		//using java Stream lamba function 
		getCharCount(words, "i");
		
		int count = StringUtils.countMatches(words, 'a');
		System.out.println ("Number of occurence :" + count );
	}

	//first method using the toCharArray method
	public static void countNumberofOccurences(String inputStr, char character) {

		char[] chars = inputStr.toCharArray();
		int count = 0;

		for (char ch : chars) {
			if (ch == character) {
				count++;
			}
		}
		System.out.println("Number of occurence of character :" + character + " count is : " + count);
	}

   //second method using the charAt method and using the length 	
	public static void countNumberofCharacters( String str , char value) {
	
		int count = 0;
		for (int i = 0 ; i < str.length() ; i ++ ) {
		
		if (str.charAt(i) == value) {
	    //increment the count 	
		count ++ ;
			}
		}
		System.out.println ("Number of occurences of each character " + value + ":" +   count);	
	}
	
	//third method to use the stream object 
	public static void getCharCount (String str , String value) {
		
		long count = str.chars()
				     .mapToObj(e -> String.valueOf((char)e))
				     .filter(e -> e.equals(value))
				     .count();
		System.out.println ("Occurence of characters " + value + ":" + count);
	}
	
	
}

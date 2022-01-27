package javapractice;

import org.apache.commons.lang3.StringUtils;

public class RemoveallWhiteSpaces {

	/*
	 * Remove all white spaces inside the String
	 * 
	 */

	public static void main(String[] args) {

		String newString = " This is my Java  "
				+"\n java course" 
				+"\t selenium course \t";
		
		System.out.println ("Before removing spaces :" + newString);
		String noWhitespace = "";
		// with the help of code remove the white spaces

		for (int i = 0; i < newString.length(); i++) {

			if ((newString.charAt(i) != ' ') && (newString.charAt(i) != '\t')) {
               noWhitespace = noWhitespace + newString.charAt(i);
			}

		}
		System.out.println ("Removing the spaces :" + noWhitespace);
		
		
		//another way of doing it by using the split functionality 
		
		String array[] = newString.split("\\s+");
		StringBuffer mynew = new StringBuffer();
		
		for (String eachword : array) {
		
			mynew.append(eachword);
		}
		System.out.println ("Removing spaces with split functionality :" + mynew);

		// trim method will remove the white spaces trailing from first and last
		// System.out.println ("Remove the white spaces from before and after :" +
		// newString.trim());

		// using the replace method by replacing the white spaces
		// System.out.println ("Removing all spaces :" + newString.replaceAll("\\s+",
		// ""));

		// with the help of StringUtils class we can remove the white spaces
		// String newUtil = StringUtils.deleteWhitespace(newString);
		// System.out.println ("White Spaces removed :" + newUtil);

	}

}

package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInsideString {

	// to find duplicate words inside the string
	// hey java is java best programming is language
	// java :2 , is : 2

	public static void main(String[] args) {

		String inputString = "Hey Java is Java best is programming lang";
		// call the method
		findDuplicateWords(inputString);

	}

	public static void findDuplicateWords(String inputString) {

		// split the string with space as delimiter and store each words inside the
		// string array
		String words[] = inputString.split(" ");
		// create one HashMap
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		// create for each loop to iterate inside the words array
		for (String wordspresent : words) {
			if (wordCount.containsKey(wordspresent)) {
				// if the value is present inside the map then store the values
				wordCount.put(wordspresent.toLowerCase(), wordCount.get(wordspresent) + 1);
			} else {
				wordCount.put(wordspresent, 1);
			}
		}
		// keySet value will return all the sets of key values inside the HashMap
		Set<String> allkeySets = wordCount.keySet();

		// loop through each keyword inside the keySet
		for (String keySets : allkeySets) {

			if (wordCount.get(keySets) > 1) {

				System.out.println("Each word" + " " + keySets + ":" + wordCount.get(keySets));
			}
		}

	}
}

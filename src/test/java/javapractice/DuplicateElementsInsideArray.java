package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInsideArray {

	public static void main(String[] args) {

		String duplicatearray[] = { "Jiten", "Jiten", "Priya", "Aadya", "Ritu" , "Aadya", "Jiten"};

		Map<String, Integer> myMap = new HashMap<String, Integer>();

		for (String words : duplicatearray) {

			if (myMap.containsKey(words)) {

				myMap.put(words, myMap.get(words) + 1);
			} else {

				myMap.put(words, 1);
			}
		}

		Set<String> mywords = myMap.keySet();

		for (String wordspresent : mywords) {

			if (myMap.get(wordspresent) > 1) {

				System.out.println("Occurence of word " + wordspresent + ":" + myMap.get(wordspresent));
			}
		}

	}

}

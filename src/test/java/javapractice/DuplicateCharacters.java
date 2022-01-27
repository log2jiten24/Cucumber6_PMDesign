package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {

		// to print the duplicate characters inside the String
		String str = "MyJitennnn";

		// call the method
		printDuplicateCharacters(str);
	}

	public static void printDuplicateCharacters(String str) {

		// handle negative Scenarios - when string is null
		if (str == null) {
			System.out.println("Null String");
			return;
		}
		// handle negative scenarios when String is empty
		if (str.isEmpty()) {
			System.out.println("String is empty ");
			return;
		}
		// handle negative Scnearios when String length is equal to 1
		if (str.length() == 1) {
			System.out.println("Single Character String ");
			return;
		}

		char words[] = str.toCharArray();

		Map<Character, Integer> myMap = new HashMap<Character, Integer>();

		for (Character ch : words) {

			if (myMap.containsKey(ch)) {

				myMap.put(ch, myMap.get(ch) + 1);

			} else {
				myMap.put(ch, 1);
			}

		}
		// print the Map
//		Set<Character> mySet = myMap.keySet();
//		
//		for (char allSet : mySet) {
//		
//		if (myMap.get(allSet) > 1) {
//				
//        System.out.println ("Number of occurence of character : - " +   allSet +  " " + ":" + myMap.get(allSet))	;
//			}
//		}

		// alternate way of printing the map -entrySet will iterate all over the HashMap 
		Set<Map.Entry<Character, Integer>> entrySet = myMap.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		          }
                           }
                                    }

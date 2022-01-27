package javabasicprogramms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementInsideArray {

	public static void main(String[] args) {

		String names[] = { "Jiten", "Priya", "Aadya", "Aadya" };

		// Create a String Array

		Map<String, Integer> newMap = new HashMap<String, Integer>();

		for (String name : names) {

			Integer count = newMap.get(name);

			if (count == null) {

				newMap.put(name, 1);

			} else {

				// store and increase the count
				newMap.put(name, ++count);
			}
		}

		Set<Entry<String, Integer>> entrySet = newMap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {

				System.out.println("Duplicate element is : " + entry.getKey());
			}
		}

	}

}

package javapractice;

import java.util.HashMap;
import java.util.Set;

public class RepeatNumberCount {

	/*
	 * Count the occurrence of the particular number- 12111 -1 coming 4 times, 2 - 1
	 * time
	 * 
	 */

	// write reusable function to do

	public static void getDigitCount(long number) {

		//to handle single digit number 
		if (String.valueOf(number).length() == 1) {
			System.out.println("number occurrence " + " : " + 1);
			return;
		}

		// create HashMap to store the number and print the occurrence
		HashMap<Long, Integer> myDigit = new HashMap<Long, Integer>();

		while (number != 0) { // 1211
			// get the remainder of the number
			long lastdigit_num = number % 10;// 1%10 -->1
			// if the remainder is present inside the HashMap , then store the value and
			// increment the occurrence count by 1
			if (myDigit.containsKey(lastdigit_num)) {

				myDigit.put(lastdigit_num, myDigit.get(lastdigit_num) + 1);

			} else {
				// default the occurence count to 1
				myDigit.put(lastdigit_num, 1);// <1, 1>, <2,1>
			}

			number = number / 10;// 12 /10 ->1

		}
		// to print all the key set

		Set<Long> mykeys = myDigit.keySet();
		// to iterate over the keys and print the occurrence
		for (long allkeys : mykeys) {

			System.out.println(" " + allkeys + " print occurrence : " + myDigit.get(allkeys));
		}

	}

	public static void main(String[] args) {

		// call the main method
		getDigitCount(12123321);
		
		//to see the single digit
		getDigitCount(2);
		
		//output - it will give 2 : 1 - it will give the single digit occurrence ,number occurrence  : 1
		
		//handle negative numbers as long can handle negative numbers also 
		getDigitCount(-12342222);
	}

}

//Output of occurrence 
//1 print occurrence 3
//2 print occurrence 3
//3 print occurrence 2

//output of occurrence of negative numbers 
//-1 print occurrence : 1
//-2 print occurrence : 5
//-3 print occurrence : 1
//-4 print occurrence : 1

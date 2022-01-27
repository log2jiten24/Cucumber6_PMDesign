package javapractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxWordCount {

	static String path = "./testdata/DemoFile.txt";

	public static void main(String[] args) {

		Map<String, Integer> wordMap = new HashMap<String, Integer>();

		BufferedReader reader = null;

		try {
			// read the File Input stream
			reader = new BufferedReader(new FileReader(path));

			// read Each Line from the text file
			String current_Line = reader.readLine();
             while (current_Line != null) {
            	 
            	
				// read each line and split each sentence with space
				String words[] = current_Line.toLowerCase().split(" ");

				for (String eachword : words) {
					
					//if it is not empty or blank , then only it will go inside the condition 
					if (!eachword.isEmpty()) {
						
					// Iterate over the for each loop and get each word inside the file
					if (wordMap.containsKey(eachword)) {
                       //store the each word inside the HashMap 
						wordMap.put(eachword, wordMap.get(eachword) + 1);
						} else {
						// if the word is not found it will go else part
						wordMap.put(eachword, 1);
					}
				}
				   }
				//inside the while loop - read the next line 
				current_Line = reader.readLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {
				// close the reader file
				reader.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		//Iterate inside the Map using Java Lambda function  to iterate over each key and value pairs 
		
		wordMap.forEach((k,v) -> System.out.println (k + ":" + v)); 
		
		//now print the maximum number of words occurrence 
		
		Map<String, Integer> maxMap = new HashMap <String , Integer>();
		
		wordMap.
		   entrySet()
		             .stream().
		                         filter(entry -> entry.getValue() == Collections.max(wordMap.values()))
		                                     .forEach(e -> maxMap.put(e.getKey(), e.getValue()));
		
		System.out.println ("------------------------");
		System.out.println (maxMap);
	}

}



//Output  each  word is repeated how many times 
//priya:1
//practice:1
//this:1
//aadya:2
//jiten:3
//is:1

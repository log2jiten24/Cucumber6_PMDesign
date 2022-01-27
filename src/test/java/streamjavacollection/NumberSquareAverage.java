package streamjavacollection;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {


		List<Integer> all_list = Arrays.asList(10, 20 , 50 , 60);
		//perform the square of all the Numbers 
		//filter the numbers which are greater than 100 
		// Divide the numbers to get the average of the numbers 
		
	double avg_numbers= 	all_list.stream()
		                    //perform the Operation inside the Map function - Map - get each element inside the list and perform the square 
			               //of the numbers 
		                 .map(e -> e * e)
		                                 //perform the filter option - > the criteria it should be greater than 100
		                                 .filter(e -> e > 100 )
		                                 //convert to Int and 
		                                                      .mapToInt(e -> e)
		                                 //then perform the average on the numbers                      
		                                 .average()
		                                 //get the average in the form of Double 
		                                           .getAsDouble();
		
	   System.out.println ("Print the double average numbers " + avg_numbers)   ;   
		
		

	}

}

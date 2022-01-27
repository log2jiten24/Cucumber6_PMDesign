package streamjavacollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintOddEvenNumbers {

	public static void main(String[] args) {
	
		
		//print the even Numbers 
		
		//Create an List which is having the list of all the numbers 
		List<Integer> all_even = Arrays.asList(10, 21 ,63,90, 2,0,7,11 , 29);
		
		//now use the stream method to print the even Numbers 
		
		List<Integer> even_list = all_even.stream()
				                                   //perform the even number operation 
		                                           .filter(e -> e%2 == 0)
		                                                                 .collect(Collectors.toList());
		
		System.out.println ("Even Numbers list is " + even_list);
		
		
		//now use the stream method to print the odd Numbers 
		
				List<Integer> odd_list = all_even.stream()
						                                   //perform the even number operation 
				                                           .filter(e -> e%2!= 0)
				                                                                 .collect(Collectors.toList());
				System.out.println ("Odd Numbers list is " + odd_list);
				

				List<Integer> prime_nums = all_even.stream()
                        //perform the even number operation 
                        .filter(e -> e/2 %2 == 0)
                                              .collect(Collectors.toList());

                         System.out.println ("Prime Numbers list is " + prime_nums);			
	}

}

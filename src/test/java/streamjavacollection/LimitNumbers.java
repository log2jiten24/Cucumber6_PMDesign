package streamjavacollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
	
		
	List<Integer> all_numbers = Arrays.asList(1 , 10 , 20 , 56, 98, 56,56,56,23);
	
	//get the first 5 numbers - use the limit function 
	List<Integer> num_limit   =  all_numbers.stream().limit(5)
	                                          .collect(Collectors.toList());
	
	System.out.println ("First 5 numbers :" + num_limit) ;
	
	 Integer sum_numbers    =   num_limit.stream().
			                                        limit(5)
			                                               //perform the sum operation 
	                                                          .reduce((a, b) -> a + b)
	                                                                     //get the Integer variable 
	                                                                    .get();
	System.out.println ("print the sum of numbers :" + sum_numbers) ;
    
    System.out.println ("----------------------Skip the Numbers ---------------------------------");
    List<Integer> num_skip = all_numbers.stream()
                                                 .skip(5)
                                                          .collect(Collectors.toList());
    System.out.println ("Numbers skipped list :" + num_skip) ;
    
     int sum_mum_skip =  all_numbers.stream()
                                             .skip(5)
                                                      .reduce((p ,q) -> p + q)
                                                                              .get();
     System.out.println ("Skip the numbers :" + sum_mum_skip);
                                                     
    
    
	}

}

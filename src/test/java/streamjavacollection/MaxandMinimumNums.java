package streamjavacollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxandMinimumNums {

	public static void main(String[] args) {


		List<Integer> numbers = Arrays.asList(10, 24, 12 , 14);
		
		int max_value = numbers.stream()
		                            //max method is using the Comparator Interface which is having the comparing method 
		                                .max(Comparator.comparing(Integer :: valueOf)).get();
		 
		 System.out.println ("Max Numbers present :" + max_value) ;
		 
		 List<Integer> min_num = Arrays.asList(10, 24, 12 , 14);
			
			Optional<Integer> min_value = numbers.stream()
			                            //max method is using the Comparator Interface which is having the comparing method 
			                                .min(Comparator.comparing(Integer :: valueOf));
			 
		System.out.println ("Minimum  Numbers present :" + min_value.get()) ;
		

	}

}

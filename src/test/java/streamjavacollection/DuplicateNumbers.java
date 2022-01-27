package streamjavacollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> all_list = Arrays.asList(2, 22, 22, 25, 25, 86, 24, 24);

		List<Integer> dup_numbers = all_list.stream()
				// Frequency method will check the frequency of the numbers
				.filter(e -> Collections.frequency(all_list, e) > 1)
				// collect the elements inside the list
				.collect(Collectors.toList());

		System.out.println("Duplicate Numbers List :" + dup_numbers);
		
        System.out.println ("------------------All list and the Second one is Set -----------------------------------------");

		Set<Integer> dup_numbers_set = all_list.stream()
				// Frequency method will check the frequency of the numbers
				.filter(e -> Collections.frequency(all_list, e) > 1)
				// collect the elements inside the list
				.collect(Collectors.toSet());

	   System.out.println("Duplicate Numbers Set :" + dup_numbers_set);
	   
	   System.out.println ("------------------Another way of doing is Hash Set -----------------------------------------");
	   
	   Set<Integer> dup_num_set = new HashSet<> () ;
	   
	   Set<Integer> dup_numbers_set_of_nums =  all_list.stream()
			                                          //this will return boolean false if the condition is not satisfied
	                                                  .filter( e-> !dup_num_set.add(e))
	                                                  //store the elements inside the Set 
	                                                                      .collect(Collectors.toSet());
	                 
	   System.out.println ("Duplicate Numbers stored inside the Set " + dup_numbers_set_of_nums);
	   
	   

	}

}

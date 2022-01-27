package streamjavacollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingofNumbers {

	public static void main(String[] args) {
	
		
		List<Integer> number_list = Arrays.asList(10 , 2 , 30 , 24 , 63 , 05) ;
		
		//Use Java Stream - sort method to sort the numbers in the ascending order 
		//by default - the sorting will happen in the ascending order 
		
		List<Integer> asec_sorting = number_list.stream()
				                                          //sorted method will by default do the asecnding order sorting
		                                                  .sorted().collect(Collectors.toList());
		
		System.out.println ("Ascending sorting number :" + asec_sorting) ;
		

	
		//Use Collections class - default sort method to sort in the ascending order 
		
		List<Integer> desc_sorting = number_list.stream()
				                                          //sorted method will by default do the ascending order sorting
		                                                  .sorted(Collections.reverseOrder())
		                                                  //store it inside the list
		                                                  .collect(Collectors.toList());
		
		System.out.println ("Descending sorting number :" + desc_sorting) ;
		
	
		

	}

}

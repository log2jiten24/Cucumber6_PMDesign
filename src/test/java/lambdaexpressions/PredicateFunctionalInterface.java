package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctionalInterface {

	public static void main(String[] args) {
	
		/*
		 * This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
		 * Represents a predicate (boolean-valued function) of one argument.
		 * This is a functional interface whose functional method is test(Object).
		 */
		
       //Define the Predicate with the following condition 
		Predicate<Integer> pred = x -> x > 5 ;
		
		//Create an ArrayList having the list of Numbers 
		List<Integer> all_nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10) ;
		
		List<Integer> filter_num = all_nums.stream().filter(pred).collect(Collectors.toList());
		
		System.out.println ("Numbers filtered greater than 5 : " + filter_num) ;
		
		//Predicate with Multiple Condition - && (AND ) 
		
		 List<Integer> filtered_num_02   = all_nums.stream().filter(x -> x > 5 && x > 9).collect(Collectors.toList());
		 
		 System.out.println ("Numbers filtered out : " + filtered_num_02) ;
		 
		 //Predicate with Negate values 
		 
		 List<String> names_list = Arrays.asList("Jaava" , "Java" , "Jaaaa" , "Jit" , "Jeet");
		 //Filter the condition with Predicate - for the String starting with Ja 
		 Predicate<String> pred_02 = x -> x.startsWith("Ja") ;
		 
		 //Usage of Negate Function
		 List<String> filtered_names  =  names_list.stream().filter(pred_02.negate()).collect(Collectors.toList());
		 
		 System.out.println ("Filtered Names : " + filtered_names) ;
		 
		
	}

}

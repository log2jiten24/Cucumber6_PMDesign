package javabasicprogramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class ListtoStringConversion {

	public static void main(String[] args) {

		
		List<Character> names = Arrays.asList('H' , 'e' , 'l' , 'l' , 'o' );
		System.out.println ("List of Characters  :" + names) ;
		//Convert List of Strings to Strings
		System.out.println ("convert list of Characters to Strings " + names.toString());
		
		String string = names.toString().substring(1, 3 *names.size()-1 )
				        .replaceAll(", ", "");
		
		System.out.println ("String representation by removing delimitters : " + string) ;
		
		System.out.println ("------------Alternative Way of doing using Java 8 Stream API --------------------------");
		
		List<Character> word_char = Arrays.asList('W' , 'O' , 'R' , 'L', 'D');
		//Convert List of Word characters to String
		
		String word_Str =  word_char.stream().map(String :: valueOf).collect(Collectors.joining());
		System.out.println ("String Representation :" + word_Str) ;
		
		System.out.println ("------------Converting List to Array --------------------------");
		
		List<String>new_word = new LinkedList<String>() ;
		new_word.add("Jiten");
		new_word.add("Going To");
		new_word.add("Kolkata");
		System.out.println ("The given list is :" + new_word) ;
		
		//converting String list to Array 
		String[] str = new_word.toArray(new String[0]);
		
		for (String  strlist : str ) {
			System.out.print ("Each elements inside the Array :" + strlist) ;
		}
		
		System.out.println ("------------Converting Array to List --------------------------");
		
		String names_arr[] = {"Jiten" , "Aadya" , "Khushi", "Priya", "Ankur engages Khushi" } ;
		
		//convert Array to String
		System.out.println ("Arrays list : " + Arrays.toString(names_arr));
		
		List<String> all_names_list = new ArrayList<String>() ;
		
		for (String str_list : names_arr) {
			all_names_list.add(str_list);
		}
		
		System.out.println ("List obtained from String is :" + all_names_list);
		
		System.out.println ("------------Converting Array to List using Collections - addAll Method --------------------------");
		
        String names_arr01[] = {"Jiten" , "Aadya" , "Khushi", "Priya", "Ankur engages Khushi" ,"Simran"} ;
		
	    List<String> all_names_list_01 = new ArrayList<String>() ;
	    //Add Array to the list using the Collections class - addAll Method
	    Collections.addAll(all_names_list_01, names_arr01);
	    
	    System.out.println ("Updated List is :" + all_names_list_01);
	    
	    System.out.println ("------------Converting Array to List using Java8 Stream--------------------------");
	    
	    String names_arr02[] = {"Jiten" , "Aadya" , "Khushi", "Priya", "Ankur engages Khushi" ,"Simran"} ;
	    
	    List<String> all_upd_list  = Arrays.stream(names_arr02).collect(Collectors.toList());
	    System.out.println ("Updated List of String is :" + all_upd_list);
	    
	    //Convert Set to List 
	    System.out.println ("------------Converting Set to List --------------------------");
	    
	    Set <String> all_set = new HashSet<> () ;
	    //adding elements 
	    all_set.add("Jiten");
	    all_set.add("Priya");
	    all_set.add("Aadya");
	    
	    System.out.println (" The elements inside the set is : ") ;
	    System.out.println (" " + all_set) ;
	    
	    List<String>set_to_list = new LinkedList<> (all_set) ;
	    System.out.println ("Elements inside the list : " + set_to_list);
	    
	    
	}

}

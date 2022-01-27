package lambdaexpressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		List<String> all_cities = new ArrayList<String> () ;
		
		//add the elements inside the List 
		all_cities.add("Sydney");
		all_cities.add("Kolkata");
		all_cities.add("Howrah");
		all_cities.add("Pune");
		all_cities.add("Arrah");
		
		//Iterate using the Stream  and For Each -> Consumer Functional Interface 
		          all_cities.stream().
		                              forEach(ele -> System.out.println ("Each Element present :" + ele));
		          
		//Iterate using the Stream and For Each 
		           all_cities.
		                      forEach(ele -> System.out.println ("Each Element present :" + ele));
		                                                                                          
		//Using the Iterator 
		Iterator <String> itr  = all_cities.iterator();
		
		while (itr.hasNext()) {
			System.out.println ("Each Element present inside the list :" + itr.next());
		}
		
		System.out.println ("--------Print using Iterator and Java 8 for ForEachRemaining Loop -----------------");
		
		itr = all_cities.iterator();
		
		//using FOr Each Remaining which is Consumer type Functional Interface 
		itr.forEachRemaining(ele -> {
			
			System.out.println ("For Each Remaining Loop each element :" + ele) ;
			
		});
		          
		          
		System.out.println ("--------Print using simple FOr Each Loop-----------------");
		
		for (String elements : all_cities) {
			
			System.out.println ("Each element :" + elements) ;
		}

		System.out.println ("--------Print using simple FOr  Loop-----------------");
		
		for (int i = 0 ; i < all_cities.size() ; i ++ ) {
			
		System.out.println ("Printing each element :" + all_cities.get(i)) ;
		
		}
		System.out.println ("--------Print using List Iterator to print in reverse order or in both direction -----------------");
		
		ListIterator<String> cities   =  all_cities.listIterator(all_cities.size());
		
		while (cities.hasPrevious()) {
		//starting from the end of the list 	
		String city_names = cities.previous();
		//traversing from backwards to first 
		System.out.println ("Each city present :" + city_names) ;
		
		}
		
		//Usage of Method References
		
		all_cities.forEach(System.out ::  println);
		
		
	}

}

package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UnaryOperator {

	public static void main(String[] args) {
		
		/*
		 * This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
		 * Represents an operation on a single operand that produces a result of the same type as its operand. 
		 * This is a specialization of Function for the case where the operand and result are of the same type.
		 */

		
		java.util.function.UnaryOperator<Integer> u1 = x -> x * 10 ;
		
		int result = u1.apply(10);
		System.out.println ("Multiplication of the variable :" + result) ;
		
		System.out.println ("------------------Alternative way --------------");
		
		Function<Integer, Integer> func = x -> x * 100 ;
		
		System.out.println ("Final Result :" + func.apply(20));
		
		System.out.println ("------------------Usage of String  --------------");
		
		Function < String , Integer> func3 = str -> str.length() ;
		 
		System.out.println ("Length of String :" + func3.apply("This is Function Interface"));
		  
		System.out.println ("------------------Usage of ArrayList  --------------");  
		 
		List<String> lang_list = new ArrayList<String> () ;
		//Add the Elements inside the array list 
		
		lang_list.add("Java") ;
		lang_list.add("Ruby") ;
		lang_list.add("Python");
		
		System.out.println ("Initial Elements :" + lang_list);
		
		lang_list.replaceAll(ele -> ele + "-" +  "Jiten");
		
		System.out.println ("Elements after Adding inside the list : " + lang_list);
		
		
		
		
		
		
		
		
	}

}

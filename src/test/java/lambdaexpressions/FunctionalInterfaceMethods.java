package lambdaexpressions;

import java.util.function.Function;

public class FunctionalInterfaceMethods {

	public static void main(String[] args) {


		/*
		 * Interface Function<T,R>
		 * Type Parameters:
           T - the type of the input to the function
           R - the type of the result of the function
           This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
		 */
		
		Function<String, Integer> func = x -> x.length() ;
		
		int len = func.apply("This is Java Lambda Function Interface");
		
		System.out.println ("Length of the String : " + len) ;
		
		Function <Integer ,Integer> func2 = x -> x * 2;
		
		//method Chaining to perform one operation into another Operation 
		int len2 =  func.andThen(func2).apply("Lambda Functional Interface");
		System.out.println ("Length of another String :" + len2) ;
		
		
		
	}

}

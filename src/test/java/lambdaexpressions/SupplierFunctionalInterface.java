package lambdaexpressions;

import java.util.function.Supplier;

public class SupplierFunctionalInterface {

	public static void main(String[] args) {
		
		
		/*
		 * This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
		 * Represents a supplier of results.
		 * There is no requirement that a new or distinct result be returned each time the supplier is invoked.
		 * it takes no argument and returns a result 
		 */
		
		//it is taking no argument and still it returns the result 
		getText(() -> "Java") ;

		getText(() -> "Python") ;
		
		getText(() -> "Ruby") ;
		
	}
	
	//Create a Supplier which takes no Argument and returns the result 
	public static void getText (Supplier<String> text) {
		
		System.out.println (text.get().length());
	}

}

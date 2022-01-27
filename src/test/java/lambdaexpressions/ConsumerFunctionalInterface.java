package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

	public static void main(String[] args) {
	
		/*
		 * 
         This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
         It returns Nothing
		 * Represents an operation that accepts a single input argument and returns no result. 
		 * Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
		 * This is a functional interface whose functional method is accept(Object).
		 */

		Consumer<String> consumer = x -> System.out.println (x) ;
		
		//do the accept method for the consumer Interface 
		
		consumer.accept("Hello this is Jitendra here ");
		
		List<Integer> all_nums = Arrays.asList(1 , 2 , 3 , 4, 5 , 6 , 7 , 8 , 9 , 10);
		
		all_nums.forEach(x -> System.out.print (x));
		
		
	}

}

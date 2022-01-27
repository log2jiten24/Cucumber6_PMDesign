package lambdaexpressions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionsWithMethodReference {

	public static void main(String[] args) {

		List<String> all_names = Arrays.asList("Jiten", "Priya", "Simran", "Vivek", "Aadya");

		// Example of Anonymous class -> usage of Internal Implementation 
		all_names.forEach(new Consumer<String>() {

			@Override // Implement the over ride method
			public void accept(String t) {

			System.out.println("Each element inside the List  :" + t);

			}

		});
		
		//Usage of Lambda Expression (using -> COnsumer Interface -> which takes parameter but it void and returns nothing)
		
		all_names.forEach(str -> System.out.println ("Each Element :" + str));
		
		//using For Each Remaining -> another Consumer Interface which takes ConsumerInterface as Parameter 
		
		Iterator<String> it = all_names.iterator();
		
		  it.forEachRemaining(ele -> System.out.println ("Each Element present :" + ele));
		
		//Usage of Method References 
		  
		all_names.forEach(System.out :: println);
		
	}

}

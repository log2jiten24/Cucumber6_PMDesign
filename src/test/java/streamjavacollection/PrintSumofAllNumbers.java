package streamjavacollection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class PrintSumofAllNumbers {

	public static void main(String[] args) {
		
		//Create the list of the Integers - having all the Numbers 
		List<Integer> all_Integers = Arrays.asList(25 , 28 ,63, 58);
		//perform the operation of a + b inside the reduce method 
		Optional<Integer>  all_sum =  all_Integers.stream().reduce((a,b) -> a + b) ;
		
		System.out.println ("Sum of Numbers :" + all_sum.get());
		
		

	}

}

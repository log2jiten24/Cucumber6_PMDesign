package streamjavacollection;

import java.util.Arrays;
import java.util.List;

public class AvgofNumbers {

	public static void main(String[] args) {
		
		
		//Create the list of the Integers - having all the Numbers 
	    List<Integer> all_Integers = Arrays.asList(25 , 28 ,63, 58);
	    
	    double average   =  all_Integers.stream().mapToInt(e -> e).average().getAsDouble();
	    System.out.println ("average of Numbers :" + average) ;

	}

}

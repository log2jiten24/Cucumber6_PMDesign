package com.java8.streams.flatMap;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamInfinite {

	public static void main(String[] args) {
		
		// Infinite Stream used to generate the Infinite Stream of data 
		
		//1.iterate ()
		//static (T Seed , Unary Operator <T> f)
		//return a stream --> Stream<T>
		//Iterate will return Unary Operator 
	    List<Integer> all_nums = IntStream.iterate(0, n -> n + 2)//give the range and the unary Operation condition to check 
		                                                         .mapToObj(Integer :: valueOf)//convert to Object 
		                                                         .limit(10)
		                                                         .collect( Collectors.toList());
        System.out.println ("Print the numbers : " + all_nums);
        
        //It will generate the Random Numbers 
        //Generate will take Supplier Interface -> it will not have any arguments but still it return anything
        
         List<Integer> all_num_02  = Stream.generate(() -> (new Random()).nextInt(100))// generate the Random Numbers 
                            		.limit(10)//limit the size 
                            		.collect(Collectors.toList()); //collect the numbers inside the list 
         
         System.out.println ("List of numbers :" + all_num_02) ;
                             
                             
                            		 
                            		 

	}
}

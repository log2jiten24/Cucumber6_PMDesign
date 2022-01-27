package com.java8.streams.flatMap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;



public class SequentialStream_02 {

	public static void main(String[] args) {
		
		
		//Creating one Sequential Stream using the Of Method and storing it inside the Stream class object
		
		Stream obj = Stream.of("Jiten" , "Aadya" , "Khushi" , "Priya") ;
		//print the elements inside the Sequential Stream stored inside the Stream Object 
		//obj.forEach(System.out:: println);
		
		//to check the first element 
//		obj.findFirst()
//		               .ifPresent(System.out:: println);
		//alternate way to check the first name 
		obj.filter(x -> "Jiten".equals(x.toString()))
		                                             .findAny().ifPresent(System.out :: println);
		
		System.out.println ("---------------using ArrayLit ----------------");
		
		Arrays.asList("Howrah" , "Arrah" , "Sydney")
		                                            .stream()//convert the ArrayList to the Sequential Stream
		                                            .findFirst()//fidn the first element 
		                                            .ifPresent(x -> System.out.println("Each element :" + x));
		
		System.out.println ("Usage of IntStream to print the range between the numbers ");
		//USage of IntStream to print the range between the numbers range 
		IntStream.range(0, 6).forEach(x -> System.out.print (x));
		
		//USage of LongStream to print the range between the numbers range 
		LongStream.range(0, 10).forEach(System.out:: print);
		
		System.out.println ("-------------to print the average -------------");
		
		Arrays.stream(new int[] {2 , 6 , 8 })
		                                       //.map(n -> n * 2 + 1)
		                                       .average()
		                                       .ifPresent(System.out:: println);
		
		
                                                     
	}

}

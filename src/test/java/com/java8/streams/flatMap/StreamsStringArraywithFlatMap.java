package com.java8.streams.flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringArraywithFlatMap {

	public static void main(String[] args) {
		
		
		//Create 2Dimensional Array 
		
		String names[][] = new String [][] {
			{"Jiten" , "Kumar" }, 
			{"Priya" , "Jeet"}, 
			{"Aadya" , "Singh"}
			} ;
		
		 
		Stream<String[]> dataStream	  = Arrays.stream(names);
		//use filter method of stream to filter the things 
		
		//Stream<String[]> dataStreamFilter  =  dataStream.filter(x -> "Jiten".equals(x.toString()));
		//filter will never work with Stream of String 
		//dataStreamFilter.forEach(System.out:: println);
		
		//usage of flatMap =convert Stream to flatMap
		Stream<String> streamFLatMap  = dataStream.flatMap(x -> Arrays.stream(x));
		
		Stream<String> newStreamFlatMap = streamFLatMap.filter(x -> "Jiten".equals(x.toString()));
		
		newStreamFlatMap.forEach(System.out:: println );
		
		
		//now do the Method chaining -composite actions 
		Stream<String> all_new_map  = Arrays.stream(names)
				                            .flatMap(x -> Arrays.stream(x))
				                            .filter(x -> "Jiten".equals(x.toString()));
		//now retrieve the value inside the 2D Array ->Method Referencing
       all_new_map.forEach(System.out :: println);

	}

}

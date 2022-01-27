package com.java8.streams.flatMap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamintArraywithFlatMap {

	public static void main(String[] args) {
		
		
		int data[] = {1 , 2 , 3 , 4 , 5};
		
		//convert Array to sequential Stream
		Stream<int[]> streamArray = Stream.of(data);
		//convert Stream to flat Map 
		IntStream intStream  = streamArray.flatMapToInt(x -> Arrays.stream(x));
		
		intStream.forEach(x -> System.out.println(x));
		                             

	}

}

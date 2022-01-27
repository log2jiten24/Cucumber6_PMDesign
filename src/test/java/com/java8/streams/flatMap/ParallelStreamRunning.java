package com.java8.streams.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamRunning {

	public static void main(String[] args) {

		// USage of Parallel Stream - how many parallel pools are available in the
		// system

		ForkJoinPool corePools = ForkJoinPool.commonPool();
		// it returns the targeted pool available in the system
		System.out.println(corePools.getParallelism());

		// usage of Parallel Stream - every time new order will get picked up -it will
		// print different elements uniquely

		Stream.of("Jiten", "Priya", "Khushi", "Aadya", "Simran", "Vivek").parallel().forEach(System.out::println);

		// usage of Sequential Stream - which will print all the elements in sequential
		// order
		System.out.println("----------------------------------------------------------------------");

		Stream.of("Jiten", "Priya", "Khushi", "Aadya", "Simran", "Vivek").forEach(System.out::println);

		// Usage of ParallelStream on the collection Stream - on any List, Set
		System.out.println("----------------------------------------------------------------------");

		Arrays.asList("Jiten", "Priya", "Khushi", "Aadya", "Simran", "Vivek").parallelStream()// it is applied on any
																								// Arrays ,List
				// or any collection
				.forEach(x -> System.out.println(x));
		// to print the range -1 to 10 using normal and Parallel Stream
		System.out.println("-----Sequential Stream Print Integers ");
		IntStream.rangeClosed(1, 10).forEach(x -> System.out.print(x));

		System.out.println("-----Parallel Stream Print Integers ");
		IntStream.rangeClosed(1, 10).parallel().forEach(x -> System.out.print(x));

		// to print the a-z range ASCII value is from 97 - 122
		System.out.println("----- to print all the alphabet characters  ");

		//System.out.println(getAlphabetList());
		
		System.out.println ("------------Sequential Order for Alphabet------------") ;
		
		getAlphabetList().forEach(x -> System.out.print (x)); 
		
		System.out.println ("------------Parallel Sequential Order for Alphabet------------") ;
		
		getAlphabetList().parallelStream().forEach(System.out:: print );
		
		//range stream to check whether it is running parallelly or not  -isParallel Method is there to check whether the stream is running
		//parallel or not 
		
		System.out.println ("------------to check the isParallel Method ------------") ;
		IntStream obj = IntStream.rangeClosed(0, 10); //create a reference variable 
		
		System.out.println (obj.isParallel());//it will give boolean result as false - as there is no parallel method being run concurrently 
		
		IntStream obj1 = IntStream.rangeClosed(0, 10); //create a reference variable 
		
		obj1.parallel() ;
		System.out.println (obj1.isParallel()); //it will return true as the parallel method is being run 	

	}

	public static List<String> getAlphabetList() {

		List<String> alphabetList = new ArrayList<String>();

		int n = 97;
		while (n <= 122) {
			char c = (char) n;// type cast the character
			alphabetList.add(String.valueOf(c));// convert the character to String and add it inside the List
			n++;// increment until the condition is satisfied
		}

		return alphabetList;

	}

}

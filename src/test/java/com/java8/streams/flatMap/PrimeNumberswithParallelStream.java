package com.java8.streams.flatMap;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.apache.commons.math3.util.Pair;

public class PrimeNumberswithParallelStream {
	
	private static Long prev = (long) 0 ;

	public static void main(String[] args) {

		System.out.println(isPrimeUsingStream(2));

		System.out.println(isPrimeNumber(2));
		
		long t1 , t2 ;
		
		t1 = System.currentTimeMillis() ;
		
	    long count =     Stream.iterate(0, n -> n + 1) //define the range 
		                                         .limit(100000)//limit the range 
		                                         //.parallel() //it will run not in sequence order 
		                                         .filter(PrimeNumberswithParallelStream :: isPrimeUsingStream)//give the specific condition 
		                                         //boolean condition - method name
		                                         .peek(x -> System.out.println(x))
		                                         //print the numbers which are prime 
		                                         .count();
	                                             //give the count of the numbers 
    System.out.println ("Get the count of the Prime Numbers :" + count ) ;
    t2 = System.currentTimeMillis() ;
    
    System.out.println ("Total time taken to run the program :" + (t2 - t1)/1000) ;
    
   //for parallel run time taken 
   // Get the count of the Prime Numbers :50001
   //Total time taken to run the program :7
    
   //For Sequential time taken to run the program is 6 secs
   // Get the count of the Prime Numbers :50001
   // Total time taken to run the program :6
    
    //Factorial of the number and count 
    
    System.out.println ("Factorial of Number : " + factorial(5));
    
    System.out.println ("Fibonacci Series :" + fibonacciAt(5));
    
	}

	public static boolean isPrimeUsingStream(int num) {

		if (num <= 1)
			return false;

		// reverse the satisfying condition to check whether the number is prime or not
		return !IntStream.range(2, num / 2).anyMatch(x -> num % 2 == 0);

	}

   //program to check the factorial of the number 
	
	public static int factorial (int num ) {
		
		return IntStream.rangeClosed(2, num).reduce( 1, (x,y) -> x * y);
	}
	
	
	//Program to find the fibonacci series 
	
	//calculate Fibonacci at given place
	public static long fibonacciAt(int place) {
	    Pair<Integer, Integer> seed = new Pair<>(0, 1);
	    //return Stream.iterate(seed, feed -> new Pair<>(feed.getValue(), feed.getValue() + feed.getKey())).limit(place).reduce((integerIntegerPair, integerIntegerPair2) -> integerIntegerPair2).orElse(seed).getValue();
	    return Stream.iterate(seed, feed -> new Pair<>(feed.getValue(), feed.getValue() + feed.getKey())).limit(place).skip(place-1).findFirst().orElse(seed).getValue();
	}
	
	// Normal Way of checking whether the number is Prime or not

	public static boolean isPrimeNumber(int num) {

		if (num <= 1)
         return false;

		boolean isPrime = true;
		int remainder = 0;

		for (int i = 2; i <= num / 2; i++) { // divide an input number,
			// say 17 from values 2 to 17 and check the remainder. If remainder is 0 number
			// is not prime.
			// No number is divisible by more than half of itself. So we need to loop
			// through just numberToCheck/2 .
			// If input is 17, half is 8.5 and the loop will iterate through values 2 to 8
          remainder = num % i;
          
            if (remainder == 0) {
				isPrime = false;
				break;
			}
            else {
				isPrime = true;
			}
		}
		return isPrime;
	}

}

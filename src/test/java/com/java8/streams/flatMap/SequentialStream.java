package com.java8.streams.flatMap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SequentialStream {

	public static void main(String[] args) {
		
		
		//Examples of Sequential Stream --create one Sequential Stream of elements using the of Method and stored inside the object
		//of the Stream class
		
		Stream stream =  Stream.of("Jiten" , "Priya" , "Khushi" , "Aadya");
		//print the elements 
	   // stream.forEach(str -> System.out.println("Each elements :" + str));
		
		stream.findFirst()
		                  .ifPresent(System.out::println);
	    
	    //once the stream function is used - we can't  use the stream again as it will throw the Illegal State Exception Error 
	    
	    System.out.println ("------------------using ArraysLISt as Stream--------------");
	    
	    Arrays.asList("iOS" , "Macbook" , "Lenovo")
	                                               .stream()//convert the ArrayElements to the Stream
	                                               .findFirst() //find the First Element inside the Array List 
	                                               .ifPresent(System.out:: println);//verify the condition if present and then print it 
	    
	    System.out.println ("---------------to print the int range between the numbers --------------");
	    //range method to print between the set of numbers -> it is type of Int Sequential Stream
	    IntStream.range(0, 5).forEach(System.out::println);
	    
	    System.out.println ("---------------to print the average of the  numbers --------------");
	    
	    Arrays.stream(new int[] {40 ,50,60, 70}) //create new int array
                                               // .map(x -> x * 2 + 1) //perform the operation which we want to perform
                                                .average()//perform the average operation
                                                .ifPresent(System.out :: println);//if condition satisfied then print the elements 
	                                             
	                                           
	    System.out.println ("---------------using examples of String --------------");
	                     
	    Stream.of("a1" , "a2" , "a3" , "a5")
	                                        .map(s -> s.substring(1))//get the second part of the String,write any logic inside map
	                                        .mapToInt(Integer::parseInt)//use method reference by using the :: operator
	                                        .max() //print the maximum among the numbers 
	                                        .ifPresent(System.out :: println);//print the numbers 
	    
	    
	    System.out.println ("---------------converting Double to String--------------");
	    
	    Stream.of(3.5 , 4.5, 6.2)
	                             .mapToInt(Double :: intValue)
	                             .mapToObj(x -> "a" + x)
	                             .forEach(System.out::println);
	                             
	    System.out.println ("---------------Using Iterate Method to get the Limit --------------");
	    //Iterate is Unary Operator Functional Interface -> to iterate over the set of Elements and limit -specifying the size of the limit 
	    Stream.iterate(0, x-> x + 1).limit(5).forEach(System.out::println);
	    
	    System.out.println ("---------------Print the Odd Numbers --------------");
	    
	   Stream.iterate(0, n -> n + 1)
	                                 .filter(n -> n%2 != 0)
	                                 .limit(10)
	                                 .forEach(x -> System.out.println(x));
	   
	   System.out.println ("---------------Print the Even  Numbers --------------");
	  
	   Stream.iterate(0, n -> n + 1)
                                     .filter(n -> n%2 == 0)
                                                            .limit(10)
                                                               .forEach(x -> System.out.println(x));
	                                                               
	                                                                 
	                         
	   

	}

}

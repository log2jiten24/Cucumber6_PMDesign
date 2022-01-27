package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap {

	public static void main(String[] args) {
		
		
		//Create an List of the Class Object type  
				List<CustomerPOJO> cust_list = Arrays.asList(
						
						//Call the CustomerPOJO Class and pass out the Details 
						new CustomerPOJO("Priya", 27) ,
						new CustomerPOJO("Jiten" , 32),
						new CustomerPOJO("Vivek" , 31),
						new CustomerPOJO("Aadya" , 03));
				//to get the particular Name from the list 
			String name =	cust_list.stream()
					                         //filter the name using the condition 
				                             .filter(x -> "Vivek".equals(x.getName()))
				                             //map the name inside the class and get the Method Reference 
				                             .map(CustomerPOJO :: getName)
				                            .findAny()
				                            .orElse(null);
			
			System.out.println ("First name is : " + name) ;
			
			System.out.println ("---------------Print all the names -----------------");
			
			List <String> cust_names = cust_list.stream()
					                             //from the POJO Class -> get All the Names 
			                                     .map(CustomerPOJO :: getName)
			                                     //store it inside the list 
			                                     .collect(Collectors.toList()) ;
			//print each Customer name 
			cust_names.forEach(System.out :: println );

			System.out.println ("---------------Print all the names using lambda expressions -----------------");
			
			List <String> cust_names_01 = cust_list.stream()
					
                    //from the POJO Class -> get All the Names using lambda expressions 
                    .map(x -> x.getName())
                    //store it inside the list 
                    .collect(Collectors.toList()) ;
			
                   //print each Customer name 
			//cust_names_01.forEach(System.out :: println );
			
			cust_names_01.forEach(x -> System.out.println(x));
	}

}

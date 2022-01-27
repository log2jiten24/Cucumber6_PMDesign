package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyorElse {

	public static void main(String[] args) {
		
		//Create an List of the Class Object type  
		List<CustomerPOJO> cust_list = Arrays.asList(
				
				//Call the CustomerPOJO Class and pass out the Details 
				new CustomerPOJO("Priya", 27) ,
				new CustomerPOJO("Jiten" , 32),
				new CustomerPOJO("Vivek" , 31),
				new CustomerPOJO("Aadya" , 03));
		
	CustomerPOJO cust_POJO = cust_list.stream() //convert list to the Stream
		                     //filter the condition to get the particular name 
		                   // .filter(x -> "Jiten".equalsIgnoreCase(x.setName("Jitendra")))
                            .filter(x -> "Jiten".equals(x.getName()))
                            .findAny()//if it finds then return - it is acting as if -> else stmt 
                            .orElse(null) ;
		    
   System.out.println ("Customer name :" + " " + cust_POJO.getName() + " " +  "Customer Age :" + " " 
                       + cust_POJO.getAge())	;	    
                     
   System.out.println ("------------------------------------------------") ;
   
   CustomerPOJO cust_POJO_01   =    cust_list.stream()
		                            //giving multiple conditions 
                                    .filter((x) -> "Priya".equals(x.getName()) && 27 == x.getAge())
                                    .findAny()
                                   .orElse(null) ;
   
   System.out.println ("Customer name :" + " " + cust_POJO_01.getName() + " " +  "Customer Age :" + " " 
           + cust_POJO_01.getAge())	;	                         
                     
	}     

}

package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class StreamsFilterWithCollect {

	public static void main(String[] args) {
		
		
		List<String> devices_list = Arrays.asList("Macbook" ,"iOS" ,"Android" , "Windows");
		
		System.out.println ("All devices in list :" + devices_list) ;
		
		//Now print the device list using for Each Loop -Consumer Functional Interface 
		
		devices_list.forEach(ele -> System.out.println (ele));
		
		//Now print the Device list in the reverse order 
		ListIterator<String> all_devices   = devices_list.listIterator(devices_list.size());
		
		while(all_devices.hasPrevious()) {
			
		String city_names =  all_devices.previous() ;
			
	    System.out.println ("Each element from Reverse :" + city_names);
		}

		//Usage of Stream - API Methods with the list 
		
		System.out.println ("---------------------- Stream API Examples ---------------------------------");
		
	   List <String> devices  =	devices_list.stream()
			                                 //to exclude Windows Element
		                                     .filter(ele ->! ele.equals("iOS"))
		                                     .collect(Collectors.toList());
	   
	  devices.forEach(str -> System.out.println (str));
	  
	  //Another way of printing it 
	  devices.forEach(System.out:: println );
	   
	   
	}

}

package com.java8.streams.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetWithFlatMap {

	public static void main(String[] args) {
	
		
		EmployeePOJOClass obj = new EmployeePOJOClass() ;
		
		//Add the names and the Devices List 
		
		obj.setDevicename("Mobiles");
		
		//Add the Devices Name 
		obj.addDeviceName("iOS");
		obj.addDeviceName("Samsung");
		obj.addDeviceName("ACER");
		obj.addDeviceName("One Plus");
		
		
        EmployeePOJOClass obj2 = new EmployeePOJOClass() ;
		
		//Add the names and the Devices List 
		
		obj2.setDevicename("Laptops");
		
		//Add the Devices Name 
		obj2.addDeviceName("DELL");
		obj2.addDeviceName("MACBOOK");
		obj2.addDeviceName("LENOVO");
		obj2.addDeviceName("ACER");
		
		//Add all the EmployeeClass Objects inside the Array List 
		
		List<EmployeePOJOClass> all_Emp_List = new ArrayList<EmployeePOJOClass> () ;
		
		//add all the EmployeeCLass Objects inside it
		
		all_Emp_List.add(obj);
		all_Emp_List.add(obj2);
		
		
		List<String> devices_list  = all_Emp_List.stream()
		                             .map(x -> x.getDeviceList()) //Stream<Set> Strings 
		                             .flatMap(x -> x.stream()) //converting to Stream<String>
		                             .distinct() //to give unique Items 
		                             .collect(Collectors.toList());//collect all the Items and Store it inside the List 
		
		//devices_list.forEach(x-> System.out.println(x));
		
		//another way of doing it 
		
		devices_list.forEach(System.out:: println);
		
		
		
		
		
		
		                                         
		
		
		
		
		

	}

}

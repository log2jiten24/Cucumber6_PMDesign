package com.jdk8.streams;

public class CustomerPOJO {
	
	private String name ;
	private int age ;
	
	//Generate the Constructors 
	public CustomerPOJO(String name, int age) {
	
		this.name = name;
		this.age = age;
	}

	//Generate Getters and Setters 
	
	public String getName() {
		return name;
	}


	public String setName(String name) {
		return this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	

}

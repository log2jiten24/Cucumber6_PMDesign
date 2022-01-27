package com.java8.streams.flatMap;

import java.util.HashSet;
import java.util.Set;

public class EmployeePOJOClass {

	private String devicename;

	private Set<String> deviceList;

	//create the constructor - to initialize the values 
//	public EmployeePOJOClass(String devicename, Set<String> deviceList) {
//
//		this.devicename = devicename;
//		this.deviceList = deviceList;
//	}

	public void addDeviceName(String devicename) {

		if (this.deviceList == null) {

			// if device name is passed as Null - then create new Device List
			this.deviceList = new HashSet<String>();
		}

		
	    this.deviceList.add(devicename);
		
	}
	
	//Generate the Getters and Setters to access the private variables 

	public String getDevicename() {
		return devicename;
	}

	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}

	public Set<String> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(Set<String> deviceList) {
		this.deviceList = deviceList;
	}
	
	

}

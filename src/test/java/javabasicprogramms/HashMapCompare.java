package javabasicprogramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;



public class HashMapCompare {

	public static void main(String[] args) {
		
		
		HashMap <Integer , String> map1 = new HashMap < Integer , String> () ;
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap <Integer , String> map2 = new HashMap < Integer , String> () ;
		
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap <Integer , String> map3 = new HashMap < Integer , String> () ;
		
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//on the basis of key and value pair : use equals method 
		
		System.out.println (map1.equals(map2)); //this will give the expression as true 
		
		System.out.println (map1.equals(map3));//this will give the expression as false 
		
		//compare two hash maps on the basis of two keys - using keySet 
		
		System.out.println (map1.keySet().equals(map2.keySet()));//this will give the expression as true 
		
		System.out.println (map1.keySet().equals(map3.keySet()));//this will give the expression as true as keyset will give unique values
		//it will ignore the duplicate values 
		
		//to find out the extra keys 
		
       HashMap <Integer , String> map4 = new HashMap < Integer , String> () ;
		
       map4.put(1, "A");
       map4.put(2, "B");
       map4.put(3, "C");
       map4.put(4, "D");
		
       //combine the keys from both map using HashSet 
       
       HashSet<Integer> combinekeys = new HashSet<> (map1.keySet());
       
       //add the map4 key values to the HashSet - it will only store the unique elements - duplicate elements will get eliminated 
       combinekeys.addAll(map4.keySet());
       
       //remove all the key values for the map1 
       combinekeys.removeAll(map1.keySet());
       
       System.out.println ("Extra Element " + combinekeys);
       
       //compare the values inside the map
       
       HashMap <Integer , String> map5 = new HashMap < Integer , String> () ;
       map5.put(1, "A");
       map5.put(2, "B");
       map5.put(3, "C");
		
		HashMap <Integer , String> map6 = new HashMap < Integer , String> () ;
		
		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6, "C");
		
		HashMap <Integer , String> map7 = new HashMap < Integer , String> () ;
		
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");
		
		//duplicates are not allowed - to compare twp arraylist values-using ArrayList 
		
		System.out.println (new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		System.out.println (new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
		
		//duplicates are allowed with the help of HashSet 
		
		System.out.println (new HashSet<> (map5.values()).equals(new HashSet<> (map6.values())));//it will give as true 
		
		System.out.println (new HashSet<> (map6.values()).equals(new HashSet<> (map7.values())));//it will give as true as it wil lgnore the 
		// duplicate values
		
		
		//using ARRAYLIST Print only the common elements in two arraylist 
		
		ArrayList<String> lang1 = new ArrayList<String> (Arrays.asList("Java" , "C#" , "Python" , "Perl"));
		
		ArrayList<String> lang2 = new ArrayList<String> (Arrays.asList("Java" , "Python"));
		
		//to see the common elements inside the arraylist
		
		lang1.retainAll(lang2);
		
		System.out.println (lang1);//Output -[Java, Python]
		
		
		
	}

}

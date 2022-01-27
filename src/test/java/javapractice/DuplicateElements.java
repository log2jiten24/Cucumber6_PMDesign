package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 20, 34, 24,  24, 32));
		
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
        
        ArrayList<Integer> numberswithoutDup = new ArrayList<Integer> (linkedHashSet) ;
        System.out.println ("Duplicate elements removed :" + numberswithoutDup) ;
        
        
		
	}

}

package javabasicprogramms;

public class CompareTwoArrays {

	public static void main(String[] args) {
	
		
		int [] array1 = {10 , 20 , 30 , 40 , 50} ;
		
		int [] array2 = {10 , 20 , 30 , 40} ;
		
		boolean isEqual = true ; //initial value of boolean value 
		
		if (array1.length == array2.length) {
			
			for (int i = 0 ; i < array1.length ; i ++ ) //iterate over the Array
			{
				if (array1[i] != array2[i]) 
				{
					isEqual = false ;
					break ;
				}
			}
			
		} else 
			
			isEqual = false ;
		
		//verify the condition
		
		if (isEqual) {
			
			System.out.println ("Two arrays are equal" ) ;
		} else 
			
			System.out.println ("Two arrays are not equal");
		

	}

}

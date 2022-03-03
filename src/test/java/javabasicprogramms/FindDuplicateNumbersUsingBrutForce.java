package javabasicprogramms;

public class FindDuplicateNumbersUsingBrutForce {

	public static void main(String[] args) {
		
		
		//FInd Duplicate Numbers in the Array combination 
		
		int arr [] = {1, 4 , 8 , 9, 7, 9} ;
		
		for (int i = 0 ; i < arr.length ; i ++ ) {
			
			for (int j = i + 1 ; j < arr.length ; j ++ ) {
				
				if (arr[i] == arr [j]) {
					
					System.out.println ("Duplicate Element Array is : " + arr[i]);
				}
				
				
			}
		}

	}

}

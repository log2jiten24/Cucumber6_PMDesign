package javapractice;

public class Min_Sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {10 , 89 , 63, 05};
		
		int min = Integer.MAX_VALUE;
		
		for (int element : array) {
			
			if (element < min) {
				
			min = element ;
			}
		}
		
	System.out.println ("Minimum element inside array :" + min);	
		

	}

}

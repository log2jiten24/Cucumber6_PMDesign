package javapractice;

public class Arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {2, 10, 20, 24} ;
		
		int k = array.length -1 ;
		
		for (k = array.length -1 ; k >=0 ; k --) {
			
		System.out.println ("Reverse of array :" + array[k]);	
		}
	}

}

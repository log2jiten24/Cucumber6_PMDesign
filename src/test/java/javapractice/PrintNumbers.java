package javapractice;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WIth this code we can print numbers from 1 to 100
//		for (int i = 1 ; i <=100 ; i ++ ) {
//			
//			System.out.println ("Numbers presnet :" + i) ;
//			
//		}

		int one = 'A' / 'A';

		String s1 = "..........";

		for (int i = one; i <= (s1.length() * s1.length()); i++) {

			System.out.println("Number printed is :" + i);
		}

		
		//ASCII value of A = 97 , B= 98 , C = 99 , D = 100 - with the help of ASCII value we can achieve this 
		for (int j = one; j <= 'd'; j += one) {
			
			System.out.println("Number printed  from 1 to 100 is :" + j);

		}
		
		//One more solution 
		
		String s = "programmin";
		
		int zero = s.length() - s.length() ;// it will give 0 
		int finalnum = s.length() * s.length() ; 
		
		for (int k = zero ; k <=finalnum ; k++ ) {
		
			System.out.println("Number printed  from 1 to 100 in another way :" + k);	
			
		}
		
	}

}

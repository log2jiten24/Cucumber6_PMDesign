package javapractice;

public class Reverse_Recursion {
	
	
	public static void reverse(int num) {
		
		if (num < 10 ) {
			System.out.print(num);
			return;
		}else {
			
		System.out.print(num%10);
		//call the reverse recursive function once again 
		reverse(num/10);
		
		}
	}
	


	public static void main(String[] args) {
		
		reverse(1234566);
		//reverse a number using recursion
//		int num = 12345;
//		
//		while (num > 0)
//		{
//			
//		int rev = num % 10 ;
//		System.out.println ("Reverse Number is :" + rev);
//		num = num /10 ;
//		
//		}
       }

}


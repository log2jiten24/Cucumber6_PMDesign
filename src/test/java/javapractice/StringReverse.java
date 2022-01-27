package javapractice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str = "01234";
//
//		String newstr = " ";
//		// convert string to character array
//		char chararray[] = str.toCharArray();
//
//		for (int i = chararray.length - 1; i >= 0; i--) {
//
//			newstr = newstr + chararray[i];
//		}
//		System.out.println("String Reversal :" + newstr);

	
	
		//to convert integer to string in second way 
		
		int n = 1239 ;
		
		String num = String.format("%05d", n);
		System.out.println ("String format :" + num);
		
		String rev = "";
		char c[] = num.toCharArray();
		
		for (int i = c.length-1 ; i >=0; i--) {
			
			rev = rev + c[i];
		}
	
		System.out.println("String Reversal :" + rev);
	
	}


	
}

package javapractice;

public class PercentageOfElements {
	
	
	/*
	 * Find Percentage of Upper case Letters , Lower Case Letters , Digits and Other Special Character inside the String
	 * Example - 'Jiten Automation 123 % ' 
	 * Upper case letters are - 10.7 %
	 * Lower case Letters are - 60.7 %
	 * Special characters are - 17.06 %
	 * 
	 */

	
	public static void ElementPercentage (String str) {
		
		int len = str.length();
		
		int upperCasecount = 0;
		int lowerCasecount = 0;
		int digits = 0;
		int specChars = 0;
		
		for (int i = 0 ; i< len ; i ++ ) {
			//get each character value of the String
			char ch = str.charAt(i);
			
			 if (Character.isUpperCase(ch)) {
				 upperCasecount++ ;
			 }
			 else  if (Character.isLowerCase(ch)) {
				 lowerCasecount++ ;
			 }
			 else  if (Character.isDigit(ch)) {
				 digits++ ;
			 }
			 else {
				 specChars++ ; 
			 }
			 
		}
		
		double UpperCasePercentage = (upperCasecount * 100 )/len  ;
		double lowerCasePercentage = (lowerCasecount * 100 )/len  ;
		double DigitPercentage     = (digits * 100 )/len  ;
		double specialCharPercentage = (specChars * 100 )/len  ;
		
		System.out.println ("Upper case Percentage :" + UpperCasePercentage);
		System.out.println ("Lower case Percentage :" + lowerCasePercentage);
		System.out.println ("Digit Percentage :" + DigitPercentage);
		System.out.println ("SpecialChar Percentage :" + specialCharPercentage);
	}
	
	
	public static void main(String[] args) {
	
		ElementPercentage("Jiten Automation 123 %");
		

	}

}

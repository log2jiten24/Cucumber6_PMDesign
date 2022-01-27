package javapractice;

public class Validate_Numbers {

	/*
	 * Validate or check if given number is valid or not Validate or check if phone
	 * number is valid or not -- 10 digits Check if Credit Card Number is valid or
	 * not -- 16 digits
	 */

	// this method is used to check whether the number is valid number or not

	public static boolean isNumber(String number) {

		try {
			Long.parseLong(number);
			System.out.println("this is valid number :" + number);

		} catch (NumberFormatException e) {

			System.out.println("not a valid number :" + number);
			return false;
		}
		return true;
	}

	/*
	 * Method to check if the phone number is valid having 10 digits
	 */

	public static boolean isvalidPhoneNumber(String phoneNumber) {

		if (phoneNumber.length() == 10 && isNumber(phoneNumber)) {
			
			System.out.println("valid phone number :" + phoneNumber);
			return true;
		}
		System.out.println("not a valid phone number :" + phoneNumber);
		return false;
	}
	
	/*
	 * Method to check if the card number is valid having 10 digits
	 */

	public static boolean isvalidCardNumber(String cardNumber) {

		if (cardNumber.length() == 16 && isNumber(cardNumber)) {
			
			System.out.println("valid card number :" + cardNumber);
			return true;
		}
		System.out.println("not a valid card number :" + cardNumber);
		return false;
	}

	
	/*
	 * Method to check the Phone number is valid using regular expressions
	 */
	public static boolean isCorrectPhoneNumberRegularExpre (String number) {
		
		return number.matches("[0-9]{10}");
		//return number.matches("\\d{10}");//d - can be any digit between 0-9 
	}
	
	/*
	 * Method to check the  number is valid using regular expressions
	 */
	public static boolean isCorrectNumberRegularExpre (String number) {
		
		//any number - it can take positive , negative, double float 
		return number.matches("^(-?\\d+\\.)?-?\\d+$");
	}
	
	public static void main(String[] args) {

		System.out.println(isNumber("12466"));
		System.out.println (isvalidPhoneNumber("88795519292@@@"));
		
		System.out.println (isvalidCardNumber("5163610084259635"));
		
		System.out.println (isCorrectPhoneNumberRegularExpre("9987051929"));
		
		System.out.println (isCorrectNumberRegularExpre("566422233"));

		//to validate any number 
		System.out.println (isCorrectNumberRegularExpre("-566422233"));
		System.out.println (isCorrectNumberRegularExpre("566422.233"));
	}

}

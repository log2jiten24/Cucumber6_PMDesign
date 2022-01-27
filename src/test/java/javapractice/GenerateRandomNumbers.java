package javapractice;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumbers {

	/*
	 * Generate Random Numbers In Java Using Random Class Math.Random function Use
	 * cases Random Number in Email , Phone Number - test123@gmail.com
	 */

	public static void main(String[] args) {

		// generate random integer number using the Random Class
		Random random = new Random();

		for (int i = 1; i <= 5; i++) {
			// generate random number - 5 times different
			System.out.println("Generate Random Number for int :" + random.nextInt());
			System.out.println("Generate Random Number for double:" + random.nextDouble());
			System.out.println("Generate Random Number for float:" + random.nextFloat());
			System.out.println("Generate Random Number for boolean:" + random.nextBoolean());
		}

		System.out.println("-----------------------------------------");

		for (int i = 1; i <= 5; i++) {
            //this will generate random double numbers 
			System.out.println("Generate random double numbers : " + Math.random());
		}
		
		System.out.println("-----------------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			// generate random number - 5 times different with ThreadLocal 
			System.out.println("Generate Random Number for int :" + ThreadLocalRandom.current().nextInt());
			System.out.println("Generate Random Number for double:" + ThreadLocalRandom.current().nextDouble());
			System.out.println("Generate Random Number for float:" + ThreadLocalRandom.current().nextFloat());
			System.out.println("Generate Random Number for boolean:" + ThreadLocalRandom.current().nextBoolean());
		}
		
		System.out.println ("------------range-----------------------");
		
		for (int i = 1 ; i <=5 ; i ++) {
			//it will generate random numbers within the particular range 
			System.out.println ("Generating random numbers within range :" + random.nextInt(20));
			//Generating random numbers within range of 1 to 20 
			System.out.println ("Generating random numbers with Math class :" + (int) (Math.random() * 20));
			//Generating random numbers within particular range 
			System.out.println ("Generating random numbers with ThreadLocal  :" + ThreadLocalRandom.current().nextInt(0, 50));
		}
		
	}

}

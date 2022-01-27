package javapractice;

/*
 * print name 1000 times without using any loop 
 * 
 */

public class printNameswithoutusingLoop {

	public static void main(String[] args) {
		
		String name = "jitendra" ;
		String s = "i";
		
		s = s.replaceAll("i", "iiiiiiiiii");//10
		s = s.replaceAll("i", "iiiiiiiiii");//10 *10 = 100
		s = s.replaceAll("i", "iiiiiiiiii");//100 * 10 = 1000
		
		s = s.replaceAll("i", name + "\n");
		System.out.println ("name 1000 times :" + s);
				
				

	}

}

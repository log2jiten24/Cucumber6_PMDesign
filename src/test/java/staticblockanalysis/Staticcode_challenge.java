package staticblockanalysis;


class Staticcode {
	
	static {
		
		System.out.println ("Test - static blokc "); 
	}
	
	public static final int x = 20 ; 
}

public class Staticcode_challenge {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println (Staticcode.x ) ;
		//in this example - output will be 20 - the static block will not get executed due to static variable will get more reference
		//this is called compiler opimisation - it will take the memory from the main class  /

	}

}

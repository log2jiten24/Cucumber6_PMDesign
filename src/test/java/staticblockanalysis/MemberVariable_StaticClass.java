package staticblockanalysis;

public class MemberVariable_StaticClass {

	//can we initialize member variables within the static block 
	
	 String name ;
	 static int age ; 
	 
	 static {
		 
		 //we cannot initialize non static variable inside the static block 
		 //name = "Jiten" ;
		 
		 //by creating the object of the class we can initialize 
		 MemberVariable_StaticClass e1 = new MemberVariable_StaticClass () ;
		 e1.name = "Aadya" ;
		 
		  //static variables can be initialized inside the static block without creating the object
		 age = 32 ;
		 System.out.println (e1.name + " " + age );
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

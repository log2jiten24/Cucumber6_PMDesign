package staticblockanalysis;

public class Instanceblokcexample {

	// this is the example of the static block

	static {

		System.out.println("Static block method ");
	}

	// initialized block it will be called only when the object of the class is
	// created
	{

		System.out.println("Initialized block");
	}

	Instanceblokcexample() {

		System.out.println("Calling the constructor");
	}

	public static void main(String[] args) {

		Instanceblokcexample obj = new Instanceblokcexample();
		System.out.println("Main method ");

	}

	// output 1 - without creating the object of the class - then initalize block
	// and constructor will not be called
//	Static block method 
//	Main method 

	// output 2 - creating object of the class - when we create object of the class
	// then the initialized block is given more preference
	// than the constructor of the class - hence first the static block and then
	// followed by the initialized block and then constructor will be called .

	// Initialized block is given more preference than the constructor of the class

	// Output 2 - Initialized block given more preference than the constructor of
	// the classs

//	Static block method 
//	Initialized block
//	Calling the constructor
//	Main method 

}

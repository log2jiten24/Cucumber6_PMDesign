package staticblockanalysis;

public class PrivateConstructorExample {

	// how can we create object if we make the constructor private

	int age;

	// create static block which will have object of the main class
	static {
		
		PrivateConstructorExample obj1 = new PrivateConstructorExample();
		System.out.println ("Static block :" + obj1.age);

	}

	//another way is to create static method and it will have the object inside the class 
	
	public static int  createobject () {
	
		//create the object inside the static method and call the static method from another  class
		PrivateConstructorExample obj2 = new PrivateConstructorExample ();
		obj2.age = 40 ;
		return obj2.age ; 
		
	}
	// Create private constructor inside the class
	private PrivateConstructorExample() {

		age = 30;
	}

	public static void main(String[] args) {

		PrivateConstructorExample obj = new PrivateConstructorExample();

		System.out.println(obj.age);

	}
}

//this will give output as 30 

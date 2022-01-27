package staticblockanalysis;

public class RunJavaClasswithoutObject {

	// this class is used to demonstrate how can we run Java Program without
	// creating any object

	static {
		System.out.println("static block ");
	}

	public static void test() {

		System.out.println("testing method ");
	}
	
	//calling static method another inside the static method 
	
	public static void cover () {
		
		System.out.println ("Cover method ") ;
		//call the static method 
		test();
	}

	public static void main(String[] args) {

		System.out.println("main method ");

		// without creating object we can call the static method
		test();
		// Static method can be called with the help of ClassName.Method Name
		RunJavaClasswithoutObject.test();
		//calling cover method 
		cover();
		
		//calling the private constructor method - for the object creation 
		
		int age = PrivateConstructorExample.createobject() ;
		System.out.println ("Age from the parent class :" + age );
		
		//without main object - execute the program by creating the static blocks 
		
		WithoutMainMethod obj3 = new WithoutMainMethod();

	}
}

//output
//static block 
//main method 
//testing method 
//testing method 

//output 2 

//static block 
//main method 
//testing method 
//testing method 
//Cover method 
//testing method 

//output 3

//static block 
//main method 
//testing method 
//testing method 
//Cover method 
//testing method 
//Static blcok :30- static block of another class will get executed first 
//Age from the parent class :40 - coming from another class 


//output 4 

//testing method 
//testing method 
//Cover method 
//testing method 
//Static blcok :30
//Age from the parent class :40
//static block A -- static block  is executed witout having the main object 
//static block B 
//static block C 

package lambdaexpressions;

public class LambdaDeclaration {

	public static void main(String[] args) {
	
		
		//try to create Object of the Interface with implementing the Anonymous Inner Class 
		
		DemoInterface demo = new DemoInterface() {
			
			@Override//implementing the Interface 
			public void print(String name, int age) {
			
				System.out.println ("Print the name : " + name + "Age is :" + age) ;
				
			}
		};
		
  

		//access the variable 
		demo.print("Aadya", 2);
		
	    System.out.println ("----------------------Using LAMBDA Expressions --------------------------------------");
		
		//every time to get the access of the variable - we need to create multiple objects 
		
		//use the Lambda expression 
		
		DemoInterface d1 = (String name ,int age) -> {System.out.println ("name is : " + name + "age is -> " + age);};
		
		d1.print("Priya" , 26);
		
		//Another way of writing the Lambda Expression 
		DemoInterface d2 = (String name , int age) -> System.out.println ("name is : " + name + "age is -> " + age) ;
		d2.print("Jeet" , 31);
		
		//Another way of writing the Lambda Expression 
		DemoInterface d3 = (name , age) -> System.out.println ("name in Upper case :" + name.toUpperCase() + " age is -> " + age) ;
		d3.print("priyajeet" , 32);
		
	}

}

package staticblockanalysis;

public class StaticblockAnalysis {

	// Create static block - static block gets more preference than the main method
	// and its called when the main class is loaded for first time

	static {

		System.out.println("Print static block A");
	}

	static {

		System.out.println("Print static block B ");
	}

	static void method() {

		System.out.println("Static method called ");
	}

	public static void main(String[] args) {

		System.out.println("Print main method B ");
	}

	static {

		System.out.println("Print static block before main method C");
		;

	}
	

	

}

//Output :- static block is called before the main method even if the static block is written after the main method still the static block will get executed 
//first before the main method .

//Print static block A
//Print static block B 
//Print static block before main method C
//Print main method B 
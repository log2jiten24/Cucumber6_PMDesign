package staticblockanalysis;

public class WithoutMainMethod {

	// execute without main method

	static {

		System.out.println("static block A ");
	}

	static {

		System.out.println("static block B ");
	}

	static {

		System.out.println("static block C ");
	}
}

//create object of the class inside another class and all the static blcok will get executed 
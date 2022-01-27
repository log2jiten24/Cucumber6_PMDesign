package lambdaexpressions;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorFunctionalInterface {

	public static void main(String[] args) {
	
		
		/*
		 * Functional Interface:
         This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
         Represents an operation upon two operands of the same type, producing a result of the same type as the operands. 
         This is a specialization of BiFunction for the case where the operands and the result are all of the same type.

		 */
		
		BinaryOperator<Integer> func = (x, y) -> x + y ;
		
		//call the abstract method available inside the BinaryOperator Functional Interface 
		int final_result = func.apply(10, 20);
		
		System.out.println ("Sum of two numbers using Binary Operator:" + final_result) ;
		
		//Alternative this also can be achieved using BiFunction - which accepts three Operands 
		
		BiFunction<Integer, Integer, Integer> func_02 = (x, y) -> x + y ;
		
		int result = func_02.apply(10, 30);
		System.out.println ("Sum of two numbwers using BiFunctions :" + result) ;

	}

}

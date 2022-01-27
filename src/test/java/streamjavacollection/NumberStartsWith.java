package streamjavacollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import groovy.lang.ObjectRange;
import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.OR;

public class NumberStartsWith {

	public static void main(String[] args) {

		List<Integer> all_nums = Arrays.asList(2, 523, 256, 296, 254, -256);

		// print the numbers starting with 2
		List<Integer> numStartWith2 = all_nums.stream()
				                                       // convert Integer to String
				                                      .map(e -> String.valueOf(e))
				                                // do the String manipulation which starts with 2
				                                     .filter(e -> e.startsWith("2") )
				                               // do the String manipulation which starts with -2
				                                     .filter(e -> e.startsWith("-2") )
				                               // convert again String to Integer
				                                     .map(Integer::valueOf)
				                               //store it inside the list 
				                                     .collect(Collectors.toList());
		
		System.out.println ("Numbers starting with 2 Series :" + all_nums);

	}

}

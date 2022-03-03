package javabasicprogramms;

import com.qa.util.ExcelReader;

import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.qa.util.*;

public class ExcelTests {

	public static void main(String[] args) {
	
		String path = "F:\\Cucumber6Series\\CucumberPOMDesign\\testdata\\Excel_testData.xlsx";
		Xls_Reader reader = new Xls_Reader(path);
		
		String cellvalue = reader.getCellData("ContactUS", "Email", 2);
		
		System.out.println ("Cell values is :" + cellvalue) ;
		
		Assert.assertEquals("log2jeet@gmail.com", cellvalue);

	}

}

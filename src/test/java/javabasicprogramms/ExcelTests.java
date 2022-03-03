package javabasicprogramms;

import com.qa.util.ExcelReader;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.qa.util.*;

public class ExcelTests {

	public static void main(String[] args) throws Exception, IOException {
	
		String path = "F:\\Cucumber6Series\\CucumberPOMDesign\\testdata\\Excel_testData.xlsx";
		Xls_Reader reader = new Xls_Reader(path);
		
		String cellvalue = reader.getCellData("ContactUS", "Email", 2);
		
		System.out.println ("Cell values is :" + cellvalue) ;
		
		Assert.assertEquals("log2jeet@gmail.com", cellvalue);
		
		List <Map<String , String >> getData = ExcelReader.getData(path, "ContactUS");
		
		String values = getData.get(1).get("Email");
		
		System.out.println ("Email values is :" + values) ;
		
		Collection <String> all_values =            getData.get(0).values();
		
		all_values.forEach(e -> System.out.println (e));
		
		Assert.assertTrue(true, "all_values.stream().anyMatch(e-> e.contains(\"log2jeet24@gmail.com\")");
		
		
	}

}

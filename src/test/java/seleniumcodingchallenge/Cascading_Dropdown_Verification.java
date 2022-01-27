package seleniumcodingchallenge;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cascading_Dropdown_Verification {
	
	public static WebDriver driver ;
	
	
	@Test
	public void launchBrowser () {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/howto/tryhow_js_cascading_dropdown.htm");
		
	}
	
	@Test
	public void verify_Cascading_Dropdown() throws JsonParseException, JsonMappingException, IOException {
		
		WebElement dropdown_subject = driver.findElement(By.id("subject"));
		WebElement dropdown_topics = driver.findElement(By.id("topic"));
		WebElement dropdown_chapters = driver.findElement(By.id("chapter"));
		
		System.out.println ("-------------------------------First  Dropdown -FirstList of Values -----------------------------------------------");
		
		Select oSelect = new Select (dropdown_subject) ;
//		//Get all the Options 
//		List<WebElement>  all_drop_down_list = oSelect.getOptions();
//		//And add into another list
//		List<String> all_list_dropdown = new ArrayList<> () ;
//		for (WebElement ele : all_drop_down_list ) {
//		all_list_dropdown.add(ele.getText());
//		}
//		System.out.println ("All Drop down List " + all_list_dropdown);
		
		//Now do the same Iteration using the stream method using the Lambda  Expressions
		 List<String> actual_dropdown = new ArrayList<> () ;
		  
		 actual_dropdown  =  oSelect.getOptions().stream().map(ele -> ele.getText()).collect(Collectors.toList());
		 //Remove the Default Drop down 
		 actual_dropdown.remove(0);
		 System.out.println ("All Drop down List " + actual_dropdown);
		  
		 //to read the Data from the JSON file
		 File newFileSrc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\JSONFiles\\CascadingDropdownList.json");
		 //Create Object of the Object Mapper class to read the Data from the JSON 
		 ObjectMapper objMapper  = new ObjectMapper();
		// readValue - method pass the FilePath and change to TypeReference -store the
		// values to Map - use TypeReference Abstract Class
		// using Anonymous Object to convert to Map
		 Map<String ,Object> all_Map_Values = objMapper.readValue(newFileSrc, new TypeReference<Map<String , Object>>() {});
		 
		 //Get all the keySets from the Map 
		 Set<String> keysets =  all_Map_Values.keySet();
		 List<String> expectedkeys = new ArrayList<String>();
		 
		 //convert Set of Strings  to the list 
		 expectedkeys.addAll(keysets);
		 System.out.println ("Expected Key Sets :" + expectedkeys) ;
		 Assert.assertEquals(actual_dropdown, expectedkeys);
		 
		 System.out.println ("-------------------------------Second Dropdown Topic Values -----------------------------------------------");
		 
		//Now select the First Dropdown 
		 oSelect.selectByVisibleText("Front-end"); 
		 
		 Select oSelect1 = new Select(dropdown_topics);
		 List<String>dropdown_list = new ArrayList<>();
		 dropdown_list  =  oSelect1.getOptions().stream().map(ele -> ele.getText()).collect(Collectors.toList());
		 //Remove the Default Dropdown 
		 dropdown_list.remove(0);
		 System.out.println ("Actual DropDown Front end Values :" + dropdown_list);
		 //Get the value as JSON Object 
		 Object front_endValue = all_Map_Values.get("Front-end");
		 //Cast the Object value to the Map 
		 Map<String , Object> frontEndMap = (Map<String, Object>) front_endValue;
		 
		 Set<String> expected_TopicSet = frontEndMap.keySet();
		 List<String> expectedTopicList = new ArrayList<> () ;
		 expectedTopicList.addAll(expected_TopicSet);
		 
		 System.out.println ("Expected DropDown Topic Values  :" + expectedTopicList);
		 
		 Assert.assertEquals(dropdown_list, expectedTopicList);
		 
		 System.out.println ("-----------------------------------Third Dropdown - Verify all the Chapter  values ------------------------");
		 
		 oSelect1.selectByVisibleText("HTML");
		 //Select the DropDown Chapters 
		 Select oSelect4 = new Select(dropdown_chapters);
		 
		List<String> all_actual_Chapters = oSelect4.getOptions().stream().map(ele -> ele.getText()).collect(Collectors.toList());
		//remove the first element
		all_actual_Chapters.remove(0) ;
		System.out.println("Actual Chapters values :" + all_actual_Chapters);
		
		Object all_topic_chapters = frontEndMap.get("HTML");
		//Convert ArrayList to List - downcasting it                          
		List<String> all_expected_chapters = (List<String>) all_topic_chapters ; 
		
		System.out.println ("Expected Chapters values :" + all_expected_chapters) ;
		
		Assert.assertEquals(all_actual_Chapters, all_expected_chapters);
		
		oSelect4.selectByVisibleText("Images");
		 
		 
		 System.out.println ("-------------------------------First  Dropdown -Second List of Values -----------------------------------------------");
		//Now select the First Dropdown for Back-end
		 oSelect.selectByVisibleText("Back-end"); 
		 
		 Select oSelect3 = new Select(dropdown_topics);
		 List<String>dropdown_list_02 = new ArrayList<>();
		 dropdown_list_02  =  oSelect3.getOptions().stream().map(ele -> ele.getText()).collect(Collectors.toList());
		 //Remove the Default Dropdown 
		 dropdown_list_02.remove(0);
		 System.out.println ("Actual DropDown Front end Values :" + dropdown_list_02);
		 //Get the value as JSON Object 
		 Object back_end_value = all_Map_Values.get("Back-end");
		 //Cast the Object value to the Map 
		 Map<String , Object> back_end_values = (Map<String, Object>) back_end_value;
		 
		 Set<String> expected_TopicSet_01 = back_end_values.keySet();
		 List<String> expectedTopicList_01 = new ArrayList<> () ;
		 expectedTopicList_01.addAll(expected_TopicSet_01);
		 
		 System.out.println ("Expected DropDown Topic BackEnd Values  :" + expectedTopicList_01);
		 
		 Assert.assertEquals(dropdown_list_02, expectedTopicList_01);
		
		 
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.close();
	}

}

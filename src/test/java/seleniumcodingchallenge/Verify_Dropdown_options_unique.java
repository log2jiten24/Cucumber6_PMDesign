package seleniumcodingchallenge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
import com.fasterxml.jackson.databind.JsonMappingException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Dropdown_options_unique {
	
	
public static WebDriver driver ;
	
	
	@Test
	public void launchBrowser () {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://geodata.solutions/");
		
	}
	
	@Test
	public void verify_unique_Dropdown() {
		
		WebElement country_list = driver.findElement(By.id("countryId"));
	
		Select oSelect = new Select (country_list) ;
		//Get all the text from the Options and store it inside the List of Strings 
		List<String> all_Options  = oSelect.getOptions().stream().map(ele -> ele.getText()).collect(Collectors.toList());
		//Remove the first element
		all_Options.remove(0);
		
		System.out.println ("All the elements for the country Dropdown :" + all_Options);
		//Set having Unique elements stored - convert the list to the Set 
		Set<String> all_final_set = new HashSet<String>(all_Options);
		
		System.out.println ("All the Set Elements for the country Dropdown :" + all_final_set);
		Assert.assertEquals(all_Options.size(), all_final_set.size());
		

}
	
	@AfterTest
	public void closeBrowser () {
		
		driver.close();
	}
	
}

package com.selenium.java8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxwithStream {

static WebDriver driver ;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver() ;
		driver.get("https://www.datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		driver.manage().window().maximize();
		
	    List<WebElement> all_checkbox =   driver.findElements(By.cssSelector("td.select-checkbox"));
		//click on each checkbox
		all_checkbox.stream().forEach(ele -> ele.click());
		
		driver.quit();
	}

}

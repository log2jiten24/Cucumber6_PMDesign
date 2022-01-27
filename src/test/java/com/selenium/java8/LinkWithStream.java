package com.selenium.java8;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkWithStream {
	

    static WebDriver driver ;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver() ;
		driver.get("https://www.freshworks.com/");
		
		driver.manage().window().maximize();
		//get the all link and store it inside the WebElement
		List<WebElement> all_links = driver.findElements(By.cssSelector("ul.footer-nav li") );
		//create another ArrayList where we can store the link text values 
		List<String> all_link_text = new ArrayList<> ();
		//capture the text and keep it storing it inside the another list 
		all_links.stream().forEach(ele -> all_link_text.add(ele.getText()));
		
		all_link_text.forEach(System.out :: println);
		
		driver.quit();
		
		
		

	}

}

package com.selenium.java8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingJava8 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		String title = switchToWindow(driver, "PopupTest Thursday" );
		
		System.out.println ("Title of the Page :" + title) ;
		
		driver.quit();

	}

	public static String switchToWindow(WebDriver driver, String title) {

		return driver.getWindowHandles().
				                        stream()//it will convert to Stream
				                                .map(handler -> driver.switchTo().window(handler).getTitle()) //switch to window 
				                                .filter(ele -> ele.contains(title))//check the title 
				                                .findFirst() //finding the first window
				                                .orElseThrow(() -> {
					                             throw new RuntimeException("No such window present");
				});
	}
}

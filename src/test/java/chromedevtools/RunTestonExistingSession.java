package chromedevtools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunTestonExistingSession {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\ChromeDriver 88\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
	    options.setExperimentalOption("debuggerAddress", "localhost:9022");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("ChromeDriver");

	}

}

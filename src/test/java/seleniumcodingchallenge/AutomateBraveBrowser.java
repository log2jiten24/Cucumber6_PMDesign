package seleniumcodingchallenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateBraveBrowser {

	public static void main(String[] args) {
	
		
		//System.setProperty("webdriver.chrome.driver", "F:\\Cucumber6Series\\CucumberPOMDesign\\drivers\\chromedriver.exe");
		
		//Launching Chrome Driver with the help of WebDriverManager
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		//Launch the Brave Browser 
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		System.out.println (driver.getCurrentUrl()) ;
		
		System.out.println (driver.getTitle());
		
		
		driver.close();
	

	}

}

package seleniumcodingchallenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunTest_Exisitng_Session {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//to run scripts on already Open Chrome Browser 
		
		
		
		ChromeOptions opt = new ChromeOptions ();
		//pass the key and value pair as URL and debuggerAddress 
		//opt.setExperimentalOption("debuggerAddress", "localhost:9988");
		
		//Now execute the scripts on the local port where the ChromeBrowser Session is already opened 
		//With the help of DriverCapavbilites we can get the exisitng session ID of the Chrome Browser 
		
		opt.setExperimentalOption("debuggerAddress", "localhost:53472");
		
		WebDriver driver = new ChromeDriver (opt) ;
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Jitendra");
		
		
		
		
		
		
			

	}

}

package seleniumcodingchallenge;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.assertj.core.util.Arrays;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlockPopupsInSelenium {
	
	static WebDriver driver ;
	static String URL = "https://www.naukri.com/" ;

	public static void main(String[] args) {
		
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		//code to block all the popups
		//ChromeOptions opt = new ChromeOptions() ;
		
		EdgeOptions opt = new EdgeOptions();
	
		//opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
        //driver = new ChromeDriver(opt);
		driver = new EdgeDriver(opt);
       // driver.manage().window().maximize();
        
        driver.get(URL);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
       
        
      Set <String> all_window =   driver.getWindowHandles();
      
      for (String windows : all_window) {
    	  
    	  driver.switchTo().window(windows);
    	  
    	  driver.findElement(By.xpath("//span[@id='allow']")).click();
    	  
      }
      
      //driver.close();
        
	}

}

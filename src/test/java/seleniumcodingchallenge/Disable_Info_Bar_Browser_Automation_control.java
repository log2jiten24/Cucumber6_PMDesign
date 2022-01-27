package seleniumcodingchallenge;

import org.assertj.core.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disable_Info_Bar_Browser_Automation_control {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions ();
		//Disable Info -Bar 
		
	//	opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation")) ;
		//we need to pass key as String and Object as List 
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://naukri.com");
		
		

	}

}

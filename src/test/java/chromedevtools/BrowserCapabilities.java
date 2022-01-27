package chromedevtools;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCapabilities {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		
		ChromeDriver driver = new ChromeDriver();
		//Capabilities Interface 
		
		Capabilities capab = driver.getCapabilities() ;
		
	   Map <String , Object> browservalues = capab.asMap();
	   
	   //it will print all the browser properties where the browser is running
	   System.out.println ("Browser properties :" + browservalues) ;
	   

	}

}

package seleniumcodingchallenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMElement {
	
	static WebDriver driver ;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.switchTo().frame("pact");
		
		//use the typecasting of JavaScriptExecutor 
		 JavascriptExecutor js = (JavascriptExecutor)driver ;
		 
		  WebElement ele = (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		  //Set Input value to the text box
		  String jse = "arguments[0].setAttribute('value', 'Green Masala Tea')";
		  //execute the Script 
		  js.executeScript(jse, ele) ;
		  


	}

}

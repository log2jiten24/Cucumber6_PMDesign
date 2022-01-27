package seleniumcodingchallenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_Covid_graph {

	static WebDriver driver;
	static String url = "https://www.google.com.au/search?q=covid+cases+in+India&sxsrf=AOaemvKYtIk__7ESe_ILY43BcfhOa2MRbQ%3A1632020975006&source=hp&ei=7qlGYYqrOoPzsAfcjp2oDg&iflsig=ALs-wAMAAAAAYUa3_566AaeCgELYIQphUeouLOTM9VyZ&oq=covid+cases+in+India&gs_lcp=Cgdnd3Mtd2l6EAMyCAgAEIAEELEDMggIABCABBCxAzILCAAQgAQQsQMQyQMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIIxAnOg4ILhCABBCxAxDHARCjAjoOCC4QgAQQsQMQxwEQ0QM6EQguEIAEELEDEIMBEMcBEKMCOgUIABCSAzoICAAQsQMQgwE6CwgAEIAEELEDEIMBOgUIABCxAzoICAAQgAQQyQNQuAhYj6gCYKO_AmgAcAB4AIABwgKIAY8ekgEIMC4xNS40LjGYAQCgAQE&sclient=gws-wiz&ved=0ahUKEwiK2unzh4rzAhWDOewKHVxHB-UQ4dUDCAk&uact=5";

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		Thread.sleep(5000);
        //capturing xpath for the first graph 
		String vertical_xpath = "(//*[local-name()='svg' and @class ='uch-psvg'])[1]//*[name()='rect']";
		String text_xpath = "//div[@class ='ExnoTd']";

		List<WebElement> barsList = driver.findElements(By.xpath(vertical_xpath));
        
		Actions act = new Actions(driver);
		for (WebElement ele : barsList) {
		//System.out.println("Total bars available:" + barsList.size());
        
		act.moveToElement(ele).perform();
		String text = driver.findElement(By.xpath(text_xpath)).getText();
		System.out.println ("Text captured :" + text);
		
		
		
	}
	}

}

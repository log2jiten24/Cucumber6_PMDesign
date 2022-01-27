package seleniumcodingchallenge;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Complex_Graph_Automation {

	static WebDriver driver;
	static String url = "https://www.google.com.au/search?q=covid+cases+in+India&sxsrf=AOaemvKYtIk__7ESe_ILY43BcfhOa2MRbQ%3A1632020975006&source=hp&ei=7qlGYYqrOoPzsAfcjp2oDg&iflsig=ALs-wAMAAAAAYUa3_566AaeCgELYIQphUeouLOTM9VyZ&oq=covid+cases+in+India&gs_lcp=Cgdnd3Mtd2l6EAMyCAgAEIAEELEDMggIABCABBCxAzILCAAQgAQQsQMQyQMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgQIIxAnOg4ILhCABBCxAxDHARCjAjoOCC4QgAQQsQMQxwEQ0QM6EQguEIAEELEDEIMBEMcBEKMCOgUIABCSAzoICAAQsQMQgwE6CwgAEIAEELEDEIMBOgUIABCxAzoICAAQgAQQyQNQuAhYj6gCYKO_AmgAcAB4AIABwgKIAY8ekgEIMC4xNS40LjGYAQCgAQE&sclient=gws-wiz&ved=0ahUKEwiK2unzh4rzAhWDOewKHVxHB-UQ4dUDCAk&uact=5";

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		Thread.sleep(5000);

		WebElement ele = driver.findElement(By.xpath("(//*[local-name()= 'svg' and @class = 'uch-psvg'])[2]"));

		int getTopLeftY = ((ele.getSize().getHeight()) / 2) - ele.getSize().getHeight();

		int getTopRightX = ((ele.getSize().getWidth()) / 2) - ele.getSize().getWidth();
		
		System.out.println ("Y Postion " + getTopLeftY);
		System.out.println ("X Postion " + getTopRightX);

		Actions act = new Actions(driver);
		
		String start_date = "20-03-2020" ;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		//get the format of the date
		Date d1 = sdf.parse(start_date);
		//get the system current date 
		Date d2 = new Date ();
		//get the Date difference 
		long date_diff = TimeUnit.MILLISECONDS.toDays(d2.getTime() - d1.getTime());
		System.out.println ("Date difference :" + date_diff);
		

		for (int i = 0; i < date_diff; i++) {
			
			act.moveToElement(ele, getTopRightX+i, getTopLeftY).perform();

		String text = driver.findElement(By.xpath("//table[@class = 'swWWne']/tbody")).getText();
		System.out.println ("Data presnt from graph :" + text);
		
		}
	}

}

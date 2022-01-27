package seleniumcodingchallenge;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Worldpopulation {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		String xpath_current_pop = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today_pop = "//div[text()='Today']//parent::div//span[@class='rts-counter']";

		String xpath_this_year = "//div[text()='This year']//parent::div//span[(@class= 'rts-counter')]";

		String xpath_today_this_year = "//div[text()='This year' or text() = 'Today']//parent::div//span[(@class= 'rts-counter')]";

		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.worldometers.info/world-population/");

		int count = 1;

		while (count <= 20) {
			// when count count < = 20 it will go inside the loop every time
			System.out.println("count in seconds :" + count);

			if (count == 21) // when count is equal to 20 loop  will get break
				break;
			System.out.println("-----------------Current Population count-----------");
			printpopulation(xpath_current_pop);

			System.out.println("-----------------Today and This Year Population count-----------");
			printpopulation(xpath_today_this_year);

			System.out.println("#######################################");
			Thread.sleep(1000);
			count++; // increase the count after every iteration

		}
	}
	
	//printing the population data 

	public static void printpopulation(String locator) {

//		List<WebElement> allspan = driver.findElements(By.xpath(locator));
//
//		for (WebElement e : allspan) {
//
//			System.out.println("all elements :" + e.getText());
//		}

		
		//alternatively we can write with the help of lambda function 
		
		driver.findElements(By.xpath(locator)).stream().
		
		                                             forEach(ele->System.out.println(ele.getText()));
	}
}
package seleniumcodingchallenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_graph {

	static WebDriver driver;
	static String url = "https://emicalculator.net/";

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
//to run the browser in headless mode 
//		ChromeOptions opt = new ChromeOptions ();
//		opt.addArguments("--headless");
//		driver = new ChromeDriver(opt);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		Thread.sleep(5000);

		String vertical_xpath = "//*[local-name()='svg']//*[name() = 'g' and @class = 'highcharts-series-group']//*[name()='rect']";
		String text_xpath = "//*[local-name()='svg']//*[name() = 'g' and @class = 'highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";

		List<WebElement> barsList = driver.findElements(By.xpath(vertical_xpath));

		System.out.println("Total bars available:" + barsList.size());

		Actions act = new Actions(driver);

		for (WebElement ele : barsList) {
			// move to each element in the bar graph
			act.moveToElement(ele).perform();
			Thread.sleep(500);
			// Store the text tip from each graph
			String text = driver.findElement(By.xpath(text_xpath)).getText();

			System.out.println("All the text captured from graph :" + text);

		}

		driver.close();
		WebElement ele = driver.findElement(By.xpath(""));
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		String error_msg = driver.findElement(By.xpath("//span[contains(text(),'Invalid credentials')]")).getAttribute("innerHTML");

	}

}

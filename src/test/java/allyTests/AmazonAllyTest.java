package allyTests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAllyTest {

	static WebDriver driver;

	private static final URL scriptUrl = AmazonAllyTest.class.getResource("/axe.min.js");

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
		ele.click();

	}

	@Test
	public void amazonAllyTest() {

		JSONObject responseJson = new AXE.Builder(driver, scriptUrl).analyze();
		JSONArray violations = responseJson.getJSONArray("violations");

		if (violations.length() == 0) {
			System.out.println("No errors ");

		} else {

			AXE.writeResults("AMAZONALLYTESTS", responseJson);
			Assert.assertTrue(AXE.report(violations), false);

		}

	}

	@Test()
	public void amazonAllyTestwithTitle() {

		JSONObject responseJson = new AXE.Builder(driver, scriptUrl).include("title").analyze();
		JSONArray violations = responseJson.getJSONArray("violations");

		if (violations.length() == 0) {
			System.out.println("No errors ");

		} else {

			AXE.writeResults("AMAZONALLYTESTS", responseJson);
			Assert.assertTrue(AXE.report(violations), false);

		}
	}
	
		@Test()
		public void amazonAllyTestwithWebElement() {

			JSONObject responseJson = new AXE.Builder(driver, scriptUrl).analyze
					(driver.findElement(By.xpath("//a[normalize-space()='Login']")));
			JSONArray violations = responseJson.getJSONArray("violations");

			if (violations.length() == 0) {
				System.out.println("No errors ");

			} else {

				AXE.writeResults("AMAZONALLYTESTS", responseJson);
				Assert.assertTrue(AXE.report(violations), false);

			}
		

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
}

package seleniumcodingchallenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DynamicWebTables {

	static WebDriver driver;

	static String url = "https://seleniumpractise.blogspot.com/2021/08?view=classic";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();

		List<WebElement> table_header = driver.findElements(By.xpath("//table[contains(@id ,'cust')]//th"));
		// to print the table header size
		System.out.println("all table header details :" + table_header.size());

		Assert.assertEquals("Column count is not same", 5, table_header.size());
		
		boolean status = false;

		for (WebElement tableheaders : table_header) {

			String table_headers = tableheaders.getText();
			//print all table headers 
			System.out.println("all table headers :" + table_headers);
			
			if(table_headers.contains("Country")) {
				
				status = true;
				break;
			}
		}

		
	System.out.println ("-------------------------------------");
	 
	
		
		//to check the check box
		
		driver.findElement(By.xpath("//td[text()='Ola']//preceding-sibling::td//input")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		//to click on the link
		driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[3]/a")).click();
		
		driver.quit();
	}

}

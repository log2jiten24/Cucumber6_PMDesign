package seleniumcodingchallenge;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks_Selenium {

	static WebDriver driver;
	static String url = "https://www.amazon.in/";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		// get the list of all elements
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links are :" + links.size());
		// create an ArrayList
		List<String> urlList = new ArrayList<String>();

		for (WebElement ele : links) {

			//get the attribute value of all the link which is having property as href
			String urls = ele.getAttribute("href");
			// add each url inside the arrayList
			urlList.add(url);
			//call the below method which checks the broken link 
			//checkBrokenLink(urls);

		}
		
		//check the start time 
		long stTime = System.currentTimeMillis();
		//write the lambda function to check for each url - parallelStream is very fast 
		urlList.parallelStream().forEach(e -> checkBrokenLink(e));
		//use of sequential stream it 
		//urlList.stream().forEach(e -> checkBrokenLink(e));
		//check the end time 
		long endTime = System.currentTimeMillis();
		//to calculate the difference between the end time and start time 
		System.out.println ("Total time taken :" + (endTime - stTime));
		
		
		//parallel Stream - its very fast to check the total 348 links available - it takes time of 37226 seconds 
		//stream - it takes more time in verifying 382 links - 2.6 minutes 
		driver.quit();

	}

	public static void checkBrokenLink(String linkURL) {

		try {
			
		URL url = new URL (linkURL);
		HttpURLConnection httpUrlConnection = (HttpURLConnection)url.openConnection();
		httpUrlConnection.setConnectTimeout(5000);
		httpUrlConnection.connect();
		
		//if the response code is greater than 400 it means its a broken url 
		if (httpUrlConnection.getResponseCode() >= 400) {
		
		System.out.println (linkURL + " ---->" + httpUrlConnection.getResponseMessage() + 
				" is a broken link ");
		
		} else {
			
		System.out.println (linkURL + " ----->" + httpUrlConnection.getResponseMessage());	
		}

		} catch (Exception e) {

		}
	}
}

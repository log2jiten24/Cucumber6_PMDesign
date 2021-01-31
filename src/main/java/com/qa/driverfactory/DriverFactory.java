package com.qa.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	/**
	 * This method is used to initialize the thread local driver on the basis of the
	 * given browser
	 * 
	 */

	public WebDriver init_driver(String browser) {

		System.out.println("browser value is :" + browser);

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			// it will create local driver instance of the Chrome Driver with the thDriver
			tlDriver.set(new ChromeDriver());

		} else if (browser.equals("firefox")) {
            
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());

		} else if (browser.equals("edge")) {
            
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		} else {

			System.out.println("Please pass out the correct value :" + browser);
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

	}

	/**
	 * 
	 * this is used to get the driver with ThreadLocal
	 * this is used for get and set the driver during the run time 
	 * @return
	 */
	public static synchronized WebDriver getDriver() {

		return tlDriver.get();

	}

}

package parallelpackage;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.driverfactory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigReader configreader;
	Properties prop;

	/*
	 * @Before(order = 0 , first method will get executed , then the order = 1 will
	 * get executed ).
	 */
	@Before(order = 0)
	public void getPropety() {

		configreader = new ConfigReader();

		prop = configreader.init_prop();

	}

	@Before(order = 1)
	public void launchbrowser() {

		String browser_name = prop.getProperty("browser");
		driverfactory = new DriverFactory();

		driver = driverfactory.init_driver(browser_name);

	}

	/*
	 * @After - order is reversed , first the Order with 1 will get executed ,then
	 * order - 0 will get executed
	 */
	@After(order = 0)
	public void quitbrowser() {

		driver.quit();

	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
		String Screen_shotname = scenario.getName().replaceAll(" ", "_");

		byte[] sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

		scenario.attach(sourceFile, "image/png", Screen_shotname);

	} 
	}

}

package selenium_CRUD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddressTest {
	
	private WebDriver driver ;
	//create object of the Page class
	private Address_Page addresspg ;

	@BeforeTest
	public void setUp () {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://a.testaddressbook.com/sign_in");
		driver.findElement(By.id("session_email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Test@12345");
		driver.findElement(By.name("commit")).click();
		
		//call the AddressPg driver class
		addresspg = new Address_Page(driver);
		
	}

	
	@Test
	public void createAddressTest() {
		
		Address_POJO address = new Address_POJO("Jiten", "Kumar", "2 Kensington", "Sydney", "2217");
		//call the methods of the Page class
		String sucess_actual_Msg = addresspg.addAddress(address);
		Assert.assertEquals(sucess_actual_Msg, "Address was successfully created.");
		
		}
	
	@Test
	public void updateAddress () {
		//Add the Address first
		Address_POJO address = new Address_POJO("Jiten003", "Kumar001", "2 Kensington", "Kogarah", "2216");
		addresspg.addAddress(address);
		
		//update the user with setters method
		address.setLastName("Kumar009");
		address.setCity("Rockdale");
		String success_update_Msg = addresspg.updateAddress(address, address.getFirstName());
		Assert.assertEquals(success_update_Msg, "Address was successfully updated.");
	}
	
	@Test
	public void deleteAddress () {
		
		//Add the Address first
		Address_POJO address = new Address_POJO("Jiten078", "Kumar004", "2 Kensington", "Kogarah", "2216");
		addresspg.addAddress(address);
		
		String success_update_Msg = addresspg.deleteAddress(address.getFirstName());
		Assert.assertEquals(success_update_Msg, "Address was successfully destroyed.");
		
	}
	
	@Test
	public void getAddressTest() {
		
		//Add the Address first
		Address_POJO address = new Address_POJO("Jeet234", "Kumar234", "Belgeave St", "Kogarah", "2217");
		
		addresspg.addAddress(address);
		
		String actual_fname = addresspg.getAddress( address.getFirstName());
		Assert.assertEquals(actual_fname, address.getFirstName());
	}
	
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
	}
}

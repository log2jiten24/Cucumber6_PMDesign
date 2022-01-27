package selenium_CRUD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Address_Page {

	     private WebDriver driver;

	     private By firstName = By.id("address_first_name");
	     private By lastName =  By.id("address_last_name");
	     private By address1 =  By.id("address_street_address");
	     private By city =      By.id("address_city");
	     private By zipCode =   By.id("address_zip_code");
	     private By createAddress = By.name("commit");
	     private By addressLink = By.linkText("Addresses");
	     private By addressnewLink = By.linkText("New Address");
	     private By successMsg = By.cssSelector("div.alert.alert-notice");
	     private By firstNameValue = By.xpath("//span[@data-test='first_name']");
	    		 
	    		 

	public Address_Page(WebDriver driver) {

		this.driver = driver;
	}

	public void clickAddressLink() {

		driver.findElement(addressLink).click();
	}

	public String fillAddress(Address_POJO address) {

		driver.findElement(firstName).clear();
		if(driver.findElement(firstName).isEnabled()) {
		driver.findElement(firstName).sendKeys(address.getFirstName());
		}
		
		driver.findElement(lastName).clear();
		driver.findElement(lastName).sendKeys(address.getLastName());
		
		driver.findElement(address1).clear();
		driver.findElement(address1).sendKeys(address.getAddress1());
		
		driver.findElement(city).clear();
		driver.findElement(city).sendKeys(address.getCity());
		
		driver.findElement(zipCode).clear();
		driver.findElement(zipCode).sendKeys(address.getZipCode());
		
		driver.findElement(createAddress).click();
		return driver.findElement(successMsg).getText();
	}

	public String addAddress(Address_POJO address) {

		clickAddressLink();
		driver.findElement(addressnewLink).click();
		return fillAddress(address);
	}

	public String updateAddress(Address_POJO address, String fName) {

		clickAddressLink();
		driver.findElement(By.xpath("//td[text() = '"+fName+"']//following-sibling::td/a[text()='Edit']")).click();
		return fillAddress(address);

	}

	public String deleteAddress(String fName) {

		clickAddressLink();
		driver.findElement(By.xpath("//td[text() = '"+fName+"']//following-sibling::td/a[text()='Destroy']"))
				.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		// to wait until the Alert comes and then accepting the Alert
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		return driver.findElement(successMsg).getText();
	}

	public String getAddress ( String fName) {
		
		clickAddressLink();
		
		driver.findElement(By.xpath("//td[text() = '"+fName+"']//following-sibling::td/a[text()='Show']"))
		.click();
		
		return driver.findElement(firstNameValue).getText();

	}
}

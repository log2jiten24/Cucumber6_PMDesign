package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	private WebDriver driver ; 
	
	//storing the ByLoctors inside the page class 
	private By email_ID = By.id("email");
	private By password = By.id("passwd");
	private By SignIn   = By.id("SubmitLogin");
	private By ForgotPwd = By.linkText("Forgot your password?/");
	private By LogOut =    By.xpath("(//a[contains(text(),'Sign out')])[1]");
	
	//create Constructor of the class page 
	
	public LoginPage (WebDriver driver) {
		
	this.driver = driver ;	
		
	}
	//actions inside the page : page features 
	
	public String  getLoginPageTitle () {
		
		return driver.getTitle();
	}
	
	public boolean isForgotPwdExist() {
		
		return driver.findElement(ForgotPwd).isDisplayed();
	}
	
	public void enterUsername (String username) {
		
		driver.findElement(email_ID).sendKeys(username);
	}
	
    public void enterPassword (String pwd) {
		
		driver.findElement(password).sendKeys(pwd);
	}

    public void clickonLogin() throws Exception {
    	
    	driver.findElement(SignIn).click();
    	Thread.sleep(3000);
    }

    public void clickonLogout () {
    	
    	driver.findElement(LogOut).click();
    	
    }
	
    
    public AccountPage  dologin(String username , String pwd ) throws Exception {
    	
    	System.out.println("Username and Password :" + username + "and" + pwd);
    	
    	driver.findElement(email_ID).sendKeys(username);
    	driver.findElement(password).sendKeys(pwd);
    	driver.findElement(SignIn).click();
    	Thread.sleep(3000);    	
    
    	return new AccountPage (driver);
    }
    
    
}

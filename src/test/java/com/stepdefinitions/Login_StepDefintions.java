package com.stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.driverfactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefintions {
	
	//create object of the class and pass the constructor variable of the driver class 
	private LoginPage loginPg = new LoginPage(DriverFactory.getDriver());
	
	private static String title;
	
	@Given("User is on the homepage login")
	public void user_is_on_the_homepage_login() {
	
	//launching  the url 
	String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	DriverFactory.getDriver().get(url);	
	
	}

	@When("User gets the title of the Home page")
	public void user_gets_the_title_of_the_home_page() {
	
	title = loginPg.getLoginPageTitle()	;
	System.out.println ("Login Page title :" + title);	
	}
	
	@When("User verifies the title of the Account Page")
	public void verify_title_AccountPage() {
		
	title = loginPg.getLoginPageTitle()	;
	System.out.println ("Account  Page title :" + title);		
		
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
		
    Assert.assertTrue(title.contains(ExpectedTitle));
	
	}

	@Then("Forgot Your Password Link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
	 
	//to verify if the forgot password link exist  or not 	
	Assert.assertTrue(loginPg.isForgotPwdExist());	
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) {
    
		loginPg.enterUsername(username);	
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
	
		loginPg.enterPassword(password);	
	}

	@When("User Clicks on the login button")
	public void user_clicks_on_the_login_button() throws Exception {
	
		loginPg.clickonLogin();
	
	}


	@When("User clicks on the Signout button")
	public void user_clicks_SignOut() {
		
		loginPg.clickonLogout();
	}



}

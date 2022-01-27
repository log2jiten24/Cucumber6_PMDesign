package com.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pages.ContactUsPage;
import com.qa.driverfactory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsStepDefinitions {

	// create object of the ContactUsPage and pass the Driver Instance from the
	// DriverFactory class
	private ContactUsPage contactUsPage = new ContactUsPage(DriverFactory.getDriver());

	@Given("User navigates to the ContactUS Page from the link")
	public void user_navigates_to_the_contact_us_page_from_the_link() {

		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=contact");

	}

	@When("User fills the data from the given SheetName {string} and rownumber {int}")
	public void user_fills_the_data_from_the_given_sheet_name_and_rownumber(String Sheetname, Integer rowNumber)
			throws Exception, IOException {

		ExcelReader obj = new ExcelReader();
		// getData will return List of Map of Strings and Strings containing the list of rows
		List<Map<String, String>> testdata = obj.getData("./testdata/Excel_testData.xlsx", Sheetname);
        
		//get each String value from the Excel Sheet 
		String heading = testdata.get(rowNumber).get("SubjectHead");
		String email =   testdata.get(rowNumber).get("Email");
		String orderRef = testdata.get(rowNumber).get("OrderRef");
		String Msg =      testdata.get(rowNumber).get("Message");
		
		//it will fill all the details 
		contactUsPage.fillContactUsForm(heading, email, orderRef, Msg);
		
		

	}

	@When("User Clicks on the send Button")
	public void user_clicks_on_the_send_button() {
		
		contactUsPage.clickSend();

	}

	@Then("Success Message is being displayed {string}")
	public void success_message_is_being_displayed(String ExpectedMsg) {
		
		String actualMsg = contactUsPage.getSuccessMessg();
		
		Assert.assertEquals(actualMsg, ExpectedMsg);

	}
	


}

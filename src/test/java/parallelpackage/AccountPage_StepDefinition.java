package parallelpackage;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountPage;
import com.pages.LoginPage;
import com.qa.driverfactory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountPage_StepDefinition {

	private LoginPage loginpg = new LoginPage(DriverFactory.getDriver());
	private AccountPage acctpg ; 
	
	@Given("User has already logged into the Application")
	public void user_has_already_logged_into_the_application(DataTable credentialtbl) throws Exception {
	  
	List<Map<String , String >> credentials = credentialtbl.asMaps();
	//get the first column value of the username and password that's why we are using index value as 0 
	String uname = credentials.get(0).get("username");
	String password = credentials.get(0).get("password");
	
	DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	acctpg = loginpg.dologin(uname, password);
	
	}

	@Given("User is on the Accounts  Page")
	public void user_is_on_the_accounts_page() {
	    
		String title = acctpg.getAccountPagetitle();
		System.out.println ("Account Page title :" + title) ;
	}

		
	@Then("User gets lands on the Account Section page")
	public void user_gets_lands_on_the_account_section_page(DataTable sectionlist) {
	    
		//as list method will return list of strings 
		List<String> expectedSectionlist =  sectionlist.asList();
		System.out.println ("Expected list from Datatable  :" + expectedSectionlist) ;
		
		List <String> actualSectionlist = acctpg.getAccountsSectionList();
		System.out.println ("Actual list from Datatable  :" + actualSectionlist) ;
		
		//using the containsAll method to verify the two list of tables 
		Assert.assertTrue(expectedSectionlist.containsAll(actualSectionlist));
		
		
	}

	@Then("Accounts section count should be displayed as {int}")
	public void accounts_section_count_should_be_displayed_as(Integer expectedCount) {

	Assert.assertTrue(acctpg.getAccountSectionCount() == expectedCount);
		
	}
}

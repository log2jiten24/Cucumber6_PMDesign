package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	

private WebDriver driver ; 
private By accountssection = By.cssSelector("div#center_column span");

public AccountPage (WebDriver driver ) {
	
this.driver = driver ;
	
}

public int getAccountSectionCount() {
	
return 	driver.findElements(accountssection).size() ;
}
	

public String getAccountPagetitle() {
	
	return driver.getTitle();
}



public List<String> getAccountsSectionList () {

   List<String> accountlist = new ArrayList<>();
   
   List<WebElement> alllist =  driver.findElements(accountssection);
   
   for (WebElement ele : alllist) {
   String text = ele.getText();
   accountlist.add(text);
   
   }
   return accountlist ;
}



}

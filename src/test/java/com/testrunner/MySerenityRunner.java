package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		features = {"src/test/resources/AppFeatures"} ,
		glue = {"com.stepdefinitions", "com.Application.hooks"} ,
		plugin = {"pretty"},
	    tags = "@ContactUs",
		monochrome = true,
		dryRun = false
		)

public class MySerenityRunner {
	
	

}

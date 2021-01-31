package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/AppFeatures"} ,
		glue = {"com.stepdefinitions", "com.Application.hooks"} ,
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/"},
	    tags = "@ContactUs",
		monochrome = true,
		dryRun = false
		 
		)


public class MytestRunner2 {

}

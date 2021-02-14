package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/AppFeatures/LoginPage.feature"} ,
		glue = {"com.stepdefinitions", "com.Application.hooks"} ,
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/"},
		monochrome = true,
		dryRun = false
		 
		)

public class MytestRunner {


}

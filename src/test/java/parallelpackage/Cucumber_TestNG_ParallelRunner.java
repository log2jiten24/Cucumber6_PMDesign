package parallelpackage;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				}, 
		monochrome = true,
		tags = "@ContactUs",
		glue = {"com.stepdefinitions", "com.Application.hooks"},
		features = {"src/test/resources/AppFeatures"}
)


public class Cucumber_TestNG_ParallelRunner extends AbstractTestNGCucumberTests {
	
	//All the Scenarios will be executed with Data Provided with the help of parallel mode 
	@Override
	@DataProvider(parallel = true)
	public Object[][]scenarios (){
		
	return super.scenarios();	
	}

}

package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_scenarios.txt", glue = "StepDefination", monochrome =true,
plugin = {"html:target/cucm.html", "json:target/cucm.json", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})
//plugin = {"html:target/cucm.html", "json:target/cucm.json"}


public class FailedTestRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel = true )
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}


package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features", glue = "StepDefination", monochrome =true,
tags = "@placeorder or @offerspage", plugin = {"html:target/cucm.html", "json:target/cucm.json", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})
//plugin = {"html:target/cucm.html", "json:target/cucm.json"}


public class TestNGTestRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel = true )
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}


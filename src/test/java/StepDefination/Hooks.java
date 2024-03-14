package StepDefination;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.interactive.form.FieldUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.gherkin.model.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import utils.TestContextSetup;

public class Hooks 
{
	TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}
	@After
	public void AfterScenario() throws IOException
	{
		testContextSetup.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(io.cucumber.java.Scenario scenario) throws IOException
	{
		WebDriver driver =testContextSetup.testBase.WebDriverManager();
		if(scenario.isFailed())
		{
		//screenshot
		File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");
		
		}
	
	}
}

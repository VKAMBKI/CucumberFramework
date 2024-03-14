package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition 
{
public WebDriver driver;
public String landingPageProductName;
public String offerPageProductName;
public TestContextSetup testContextSetup;
LandingPage landingPage;

public LandingPageStepDefinition(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
	this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
	
}
	@Given("user is on Greencart Landing page")
	public void user_is_on_greencart_landing_page()
	{
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	}
	
	@When("^user serched with Shortname (.+) and extracted actual name of product$")
	public void user_serched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException 
	{
		
		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		//LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		System.out.println(landingPageProductName +" is extracted from Home page");
			
	}
	
	@When("added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity)
	{
	    landingPage.IncremenntQuantity(Integer.parseInt(quantity));
	    landingPage.addToCart();
	}

}

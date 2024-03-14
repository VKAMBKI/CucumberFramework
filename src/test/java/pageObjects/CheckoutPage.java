package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;

	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	By cartBag = By.cssSelector("[alt='Cart']");
	By checkoutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promobtn = By.cssSelector(".promoCode");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	
	public void checkOutItem()
	{
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
	}
	public boolean verifyPromobutton()
	{
		return driver.findElement(promobtn).isDisplayed();
	}
	public boolean verifyPlaceOrdrer()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	
}

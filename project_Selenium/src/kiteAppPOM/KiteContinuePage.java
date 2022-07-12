package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteContinuePage {
	//1.data member
	@FindBy(id="pin") private WebElement UserID;
	@FindBy(xpath="//button[@type='submit']") private WebElement ContinueButton;
	//2.constructor
	public KiteContinuePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3.methods
	public void sendUserID()
	{
		UserID.sendKeys("982278");
	}
	public void sendContinueButton()
	{
		ContinueButton.click();
	}
}

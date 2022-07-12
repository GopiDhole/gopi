package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//1.data member
	@FindBy(xpath="//span[@class='user-id']") private WebElement Name;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;   //private int a; 
	//2.constructor
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	public void LoginName()
	{
		Name.click();
	}
	
	public void LoginText()
	{
		String actual = Name.getText();
		String expected="ELR321";
		if(actual.equals(expected))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
	}
	
	public void logout1()
	{
		logout.click();
	}
	
	
}

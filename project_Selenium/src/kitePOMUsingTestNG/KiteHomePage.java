package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteHomePage {
  //1.data member
	@FindBy(xpath="//span[@class='user-id']") private WebElement userName;
	@FindBy(xpath="//a[@target='_self']") private WebElement logOutButton;
	//2.constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	public void validateUserName(String expectedUserID)
	{
		String expectedUSerName=expectedUserID;
		String actualUserName=userName.getText();
		
		if(expectedUSerName.equals(actualUserName))
		{
			System.out.println("ACtual and Expected USer ID are matching TC is pass");
		}
		else
			{
				System.out.println("Actual and Expected USer Id are not matching TC is failed ");
			}
		
	}
	
	//to get actual userName
	public String getActualUserName()
	{
		String actualUserName=userName.getText();
		return actualUserName;
		
	}
	
	public void logOut()
	{
		userName.click();
		logOutButton.click();
	}
	
}

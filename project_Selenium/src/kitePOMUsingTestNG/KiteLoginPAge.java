package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class KiteLoginPAge
{
 //1.data member
	@FindBy(id="userid") private WebElement userName;
	@FindBy(id="password") private WebElement passWord;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
	//2. constructor
	public KiteLoginPAge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. method
	
	public void sendUserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	public void sendPassword(String PassWord)
	{
		passWord.sendKeys(PassWord);
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}

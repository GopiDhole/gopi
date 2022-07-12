package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteBase.Base;
import kiteBase.BaseNew;
import kitePOMUsingTestNG.KiteHomePage;
import kitePOMUsingTestNG.KiteLoginPAge;
import kitePOMUsingTestNG.KitePinPage;
import kiteUtility.Utility;
import kiteUtility.UtilityProp;
@Listeners(kiteUtility.Listener.class)
public class ValidateKiteUSerIDUsingProperty extends BaseNew{
	KiteLoginPAge login;
	KitePinPage pin;
	KiteHomePage home;
	//String TCID="555";
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login=new KiteLoginPAge(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
		login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
		Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
		Assert.fail();
	}
	
	@AfterMethod
	public void logOutFromKite()
	{
		home.logOut();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

	
 
}

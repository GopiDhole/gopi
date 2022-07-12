package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBase.Base;
import kitePOMUsingTestNG.KiteHomePage;
import kitePOMUsingTestNG.KiteLoginPAge;
import kitePOMUsingTestNG.KitePinPage;
import kiteUtility.Utility;

public class ValidateKiteUSerID extends Base{
	KiteLoginPAge login;
	KitePinPage pin;
	KiteHomePage home;
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		login=new KiteLoginPAge(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(Utility.readDataFromExcel(2,0));
		login.sendPassword(Utility.readDataFromExcel(2, 1));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPin(Utility.readDataFromExcel(2, 2));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
		Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(2, 0),"Actual and Expected are not matching TC failed");
		
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

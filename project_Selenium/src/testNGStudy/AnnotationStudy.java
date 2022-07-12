package testNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy {
  @Test
  public void validateUserID() 
  {
	  Reporter.log("User ID VAlidated",true);
  }
  @BeforeMethod
  public void loginToKiteApp() 
  {
	  Reporter.log("Login Success",true);
  }

  @AfterMethod
  public void logoutFromKiteApp() 
  {
	  Reporter.log("logging out....",true);
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("browser Launch",true);
  }

  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("Browser closed",true);
  }

}

package verificationUsingTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyRadioButton {
  @Test
  public void myMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
	  WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	  radioButton1.click();
	  if(radioButton1.isSelected())
	  {
		  Reporter.log("TC pass Radio button is selected",true);
	  }
	  else
	  {
		  Reporter.log("TC failed Radio button is not selected",true);
	  }

	  
  }
}

package fireFoxUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class myMethod {
  @Test
  public void myMethod1() 
  {
	  System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
  }
}

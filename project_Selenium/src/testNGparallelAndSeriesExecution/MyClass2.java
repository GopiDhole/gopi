package testNGparallelAndSeriesExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test
  public void MyMethod1() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
  }
}

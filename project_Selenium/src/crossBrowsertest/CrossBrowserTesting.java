package crossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	@Parameters("browsername")
  @Test
  public void myMethod(String name) throws InterruptedException 
 
  {
		 WebDriver driver=null;
	 if(name.equals("firefox")) 
	 {
	 System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	 driver=new FirefoxDriver();
  }
	else if(name.equals("chrome"))
	{
	 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	 driver.get("https://vctcpune.com/selenium/practice.html");
	 Thread.sleep(1000);
	 driver.close();
  }
}

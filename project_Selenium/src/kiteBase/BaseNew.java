package kiteBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import kiteUtility.UtilityProp;

public class BaseNew 
{
	protected static WebDriver driver;
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		//ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("disable notifications");
		//opt.addArguments("incognito");
		driver=new ChromeDriver();
		driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		//driver.manage().window().maximize();
		Reporter.log("Launching browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public void captureScreenshot(String name) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\ScreenShotFILE\\ScreenShot33"+name+".png");
		FileHandler.copy(src,dest);
	}

}

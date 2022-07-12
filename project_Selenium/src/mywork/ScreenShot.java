package mywork;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
//		 //Full Page ScreenShot
//		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 File dest=new File("E:\\ScreenShotFILE\\screenshot1.png");
//		 FileHandler.copy(src, dest);
//		 
		 //Screenshot of section/portion of the page
		 Thread.sleep(1000);
		 WebElement section = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg col-2-12']"));
		 File src1=section.getScreenshotAs(OutputType.FILE);
		 File dest1=new File("E:\\ScreenShotFILE\\screenshot2.png");
		 FileHandler.copy(src1, dest1);
	}

}

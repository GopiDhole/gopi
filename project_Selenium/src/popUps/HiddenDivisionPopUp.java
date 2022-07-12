package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		String test1 = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println(test1);
		
		String test2 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(test2);
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("Frame Inside Frame");
		
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		WebElement listBox = driver.findElement(By.id("animals"));
		Select s=new Select(listBox);
		s.selectByVisibleText("Baby Cat");
	}

}

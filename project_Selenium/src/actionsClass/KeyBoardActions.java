package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//find Element
		 WebElement textBox = driver.findElement(By.id("autocomplete"));
		 //textBox.sendKeys("Good Morning");-->using webElement method
		 
		 //how to send keys using Actions Class
		 //create object of Actions class and pass driver object
		 
		 Actions act=new Actions (driver);
		 //using sendKeys() method of Actions Class perform sendKeys task
		 act.sendKeys(textBox,"Good Morning").perform();
		 
		 //how to handle drop down using Actions Class
		 WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		 //using actions Class method handle dropdown
		 act.click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}

package actionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
	// 1. seleniumButton.click(); //using WebElement method
	
	//how to click using Actions Class
	//Create object of Actions class and pass driver object
	Actions act=new Actions(driver);
	/*act.moveToElement(seleniumButton).perform();-->method 1. 
	act.click().perform();*/
	/*act.moveToElement(seleniumButton).click().build().perform();*///--> method 2
	/*act.click(seleniumButton).perform();//-->method 3. webElement Target*/
	
	//how to right click using Actions Class
	WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
	/*act.moveToElement(rightClickButton).perform();
	act.contextClick().perform();*/
	/*act.moveToElement(rightClickButton).contextClick().build().perform();*/
	/*act.contextClick(rightClickButton).perform();*/
	
	//how to handle alert popup
	/*WebElement deleteButton = driver.findElement(By.xpath("//span[text()='Delete']"));
	act.click(deleteButton).perform();
	Thread.sleep(1000);
	Alert alt = driver.switchTo().alert();
	alt.accept();*/
	
	//how to double click using Actions Method
	WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	act.doubleClick(doubleClickButton).perform();
	}

}

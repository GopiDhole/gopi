package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		hide.click();
		Thread.sleep(1000);
		WebElement show = driver.findElement(By.id("show-textbox"));
		show.click();
		Thread.sleep(1000);
		WebElement textBox = driver.findElement(By.name("show-hide"));
		textBox.sendKeys("seen");
		Thread.sleep(1000);
		System.out.println(textBox.isDisplayed());
		System.out.println(show.isDisplayed());
		if(textBox.isDisplayed())
		{
			System.out.println("Thank you text box is displayed");
		}
		else
		{
			System.out.println("cant find textbox");
		}
		hide.click();
		if(textBox.isDisplayed())
		{
			System.out.println("Thank you text box is displayed");
		}
		else
		{
		System.out.println("cant find textbox");
		}
	}

}

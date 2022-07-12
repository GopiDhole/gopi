package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxeg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		//1. identify list box to be handled and store it in reference variable
		WebElement listbox = driver.findElement(By.name("dropdown-class-example"));
		//2. create an object of Select class which will accept WebElement as argument
		Select s=new Select(listbox);
		//3. By using one of the select class methods we can select values from list box like
		s.selectByVisibleText("Option1");
		Thread.sleep(1000);
		s.selectByValue("option2");
		Thread.sleep(1000);
		s.selectByIndex(3);
	}

}

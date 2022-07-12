package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
	//1. 
	System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText());
	//2.
	String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
	System.out.println(text);
	//3.
	WebElement element = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
	System.out.println(element.getText());
	}

}

package selenium_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumCode {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe" ) ;	
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi Gm");
	driver.findElement(By.xpath("//input[@list='mah-district']")).sendKeys("Hi Gm");
	}

}

package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		 //checkbox.click();
		 if(checkbox.isSelected())
		 {
			 System.out.println("CheckBox is already selected");
		 }
		 else
		 {
			 checkbox.click();
			 System.out.println("Checkbox is now selected");
		 }
		 
	}

}

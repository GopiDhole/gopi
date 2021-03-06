package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("honda");
		List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println(searchResults.size());
		for(WebElement r:searchResults)//for getting text only
		{
			System.out.println(r.getText());
		}
		Thread.sleep(1000);
		for(WebElement result:searchResults)//for clicking on required result
		{
			String actualText=result.getText();
			String expectedText="honda amaze";
			if(actualText.equals(expectedText))
			{
				result.click();
				Thread.sleep(1000);
				break;
			}
				
		}
		driver.findElement(By.linkText("Images")).click();
		
	}

}

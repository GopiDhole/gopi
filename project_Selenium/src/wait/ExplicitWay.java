 package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About us']"));
		wait.until(ExpectedConditions.visibilityOf(aboutUs));
		aboutUs.click();
		
	}

}

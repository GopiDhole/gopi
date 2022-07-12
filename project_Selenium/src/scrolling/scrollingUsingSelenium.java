package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingUsingSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		JavascriptExecutor e=(JavascriptExecutor)driver;
		e.executeScript("window.scrollBy(90,800)");
	}

}

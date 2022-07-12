package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.w3schools.com/js/tryitasp?filename=tryjs_myfirst");
	 Thread.sleep(5000);
	 driver.switchTo().frame("iframeResult");
	 driver.findElement(By.xpath("//button[@type='button]")).click();

	}

}

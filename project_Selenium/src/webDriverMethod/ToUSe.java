package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUSe {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://vctcpune.com/");

	}

}

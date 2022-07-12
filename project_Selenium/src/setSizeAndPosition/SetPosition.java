package setSizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.manage().window().getPosition());
		//to set position we need to create object of Point Class and pass X and Y coordinates
		Point p=new Point(100,30);
		//using setPosition method we can set position
		driver.manage().window().setPosition(p);
	}

}

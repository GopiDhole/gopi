package misc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		driver.manage().window().maximize();
		String mainPageId = driver.getWindowHandle();
		System.out.println(mainPageId);
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
		Thread.sleep(1000);
		
//		Set<String> multiId = driver.getWindowHandles();
//		for (String a:multiId)
//		{
//			System.out.println(a);
//
//		if(!a.equals(mainPageId))
//		{
//			driver.findElement(null)
//		}
		
		
	}

}

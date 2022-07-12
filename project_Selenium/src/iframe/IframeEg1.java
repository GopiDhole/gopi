package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	private static final String Frame1 = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/iframes/");
		driver.manage().window().maximize();
		
		//finding element on main frame
		String test1 = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		System.out.println(test1);
		
		String test2 = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
		System.out.println(test2);
		
		//switch main frame to frame 1 by ID
//		driver.switchTo().frame("Frame1");
//		String test3 = driver.findElement(By.xpath("//a[text()='Category1']")).getText();
//		System.out.println(test3);
//		
//		String test4 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
//		System.out.println(test4);
		
		//switch main frame to frame 1 by index
		driver.switchTo().frame(0);
		String test5 = driver.findElement(By.xpath("//a[text()='Category2']")).getText();
		System.out.println(test5);
		
		//switch main frame to frame 2 by ID
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		String test6 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
		System.out.println(test6);
		String test7 = driver.findElement(By.linkText("Category3")).getText();
		System.out.println(test7);
		
		
		driver.switchTo().defaultContent( );
		String test8 = driver.findElement(By.xpath("//input[@name='home']")).getText();
		 System.out.println(test8);
	}

}

package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//		Dimension d=new Dimension(1000,1000);
//		driver.manage().window().setSize(d);
//		Dimension d2=driver.manage().window().getSize();
//		System.out.println(d2);
//		Thread.sleep(1000);
//		Point p=new Point(100,50);
//		driver.manage().window().setPosition(p);
//		System.out.println(driver.manage().window().getPosition());
		
		//To get ID of main page
		String mainPageId = driver.getWindowHandle();
		System.out.println(mainPageId);
		//to open child window
		driver.findElement(By.name("NewWindow")).click();
		//to handle multiple windows/to get multiple Ids
		Set<String> allPageIds = driver.getWindowHandles();
		
		//by using iterator method
		Iterator<String> it = allPageIds.iterator();
		String mainPageIds=it.next();
		String childPageId=it.next();
		System.out.println("mainPageId "+mainPageIds);
		System.out.println("childPageId "+childPageId);
		
		//To switch focus to child window
		driver.switchTo().window(childPageId);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement( By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
		
		driver.switchTo().window(mainPageId);
		WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		System.out.println(myElement.getText());
	}

}

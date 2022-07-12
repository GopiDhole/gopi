package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		//get:-to enter url in browser or to open an application.
		driver.get("https://vctcpune.com/");
		//close:-to close the current tab of the browser opened by Selenium tool.
		//driver.close();
		//quit:-to close the all the tabs present in browser opened by Selenium tool
		//driver.quit();
		//maximize/minimize:-used to maximize/minimize the browser
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		//navigate: this method is use to open an application, move forward, backward & refresh the webpage
//		driver.navigate().to("https://www.google.com/");
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
		
		//getTitle: this method is use to get title of a webpage. return type of getTitle method is String.
//		System.out.println(driver.getTitle());
//		//with reference
//		 String Title = driver.getTitle();
//		 System.out.println("Title is "+Title);
		 
		 //getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String
		 System.out.println(driver.getCurrentUrl());
		 //with reference
		 String url = driver.getCurrentUrl();
		System.out.println("The url is "+url);
		
		
		 
		
		
	}
}

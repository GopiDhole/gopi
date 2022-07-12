package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bind.annotation.Super;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 KiteLoginPage login=new KiteLoginPage(driver);
		 login.senduserName();
		 login.sendPassword();
		 login.clickOnLoginButton();
		 
		 Thread.sleep(1000);
		 
		 KiteContinuePage cont=new KiteContinuePage(driver);
		 cont.sendUserID();
		 cont.sendContinueButton();
		 
		 Thread.sleep(1000);
		 HomePage hp=new HomePage(driver);
		 hp.LoginName();
		 hp.LoginText();
		 Thread.sleep(1000);
		 hp.logout1();
		 
		
	}

}

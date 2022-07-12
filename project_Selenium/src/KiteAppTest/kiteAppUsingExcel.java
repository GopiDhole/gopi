package KiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteAppUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		File myfile=new File("E:\\\\GOPI SOFTWARE TESTING\\\\ExcelSheet1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Data2");
		String UN = mySheet.getRow(2).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(2).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(2).getCell(2).getStringCellValue();// Numeric value is changes into string in excel sheet
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 WebElement userID = driver.findElement(By.id("userid"));
		 WebElement passWord = driver.findElement(By.id("password"));
		 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		 userID.sendKeys(UN);
		 passWord.sendKeys(PWD);
		 loginButton.click();
		 Thread.sleep(3000);
		 WebElement pin = driver.findElement(By.id("pin"));
		 WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		 pin.sendKeys(PIN);
		 continueButton.click();
		 Thread.sleep(3000);
		 WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		 String actualUserID = userName.getText();
		 String expectedUserID = UN;
		 
		 if(actualUserID.equals(expectedUserID))
		 {
			 System.out.println("User ID matching TC is PASSED");
		 }
		 else
		 {
			 System.out.println("User ID not matching TC is FAILED");
		 }
		 Thread.sleep(1000);
		 userName.click();
		 Thread.sleep(1000);
		 //driver.findElement(By.xpath("//a[@target='_self']")).click();
		 //driver.close();
	}

}

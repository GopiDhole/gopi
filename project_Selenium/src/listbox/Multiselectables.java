package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/select-menu");
WebElement MultiSelectElement = driver.findElement(By.name("cars"));

Select s=new Select(MultiSelectElement);
System.out.println("Multi Select Status is "+s.isMultiple());

s.selectByVisibleText("Volvo");
Thread.sleep(200);
s.selectByValue("saab");
Thread.sleep(200);
s.selectByIndex(2);
Thread.sleep(200);
s.selectByIndex(3);


//s.deselectAll();
//Thread.sleep(100);
//s.deselectByIndex(3);
//Thread.sleep(100);
//s.deselectByIndex(2);
//Thread.sleep(100);
//s.deselectByValue("saab");

System.out.println(s.getFirstSelectedOption().getText());
System.out.println(s.getAllSelectedOptions());

	}

}

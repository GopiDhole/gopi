package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//how to find no of rows in a table
		 List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		 System.out.println(rows.size());//same output as #
		 //or
		 int totalNumOfRows = rows.size();
		 System.out.println("total number of rows in table "+totalNumOfRows);//same output as #
		 //how to find no of columns in a table
		 List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		 System.out.println("Total No of Columns in a table "+columns.size());
		 //or
		 int totalNoOfColumns = columns.size();
		 System.out.println("Total No of Columns in a table "+totalNoOfColumns);
		 System.out.println("=============================");
		 //how to read header
//		 for(WebElement header:columns)
//		 {
//			 System.out.print(header.getText()+" ");
//		 }
		 //how to read all rows from table
		 List<WebElement> allRowsData = driver.findElements(By.xpath("//table//tr"));
		 Iterator<WebElement> it = allRowsData.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next().getText());
			 System.out.println();
		 }
	}

}

package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketScoreCard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-stats/points-table/test/icc-world-test-champion");
		driver.manage().window().maximize();
	//How to find no of rows in a table	
		 List<WebElement> NoOfTableRow = driver.findElements(By.xpath("//table//tr"));	
		System.out.println("Total No of Rows "+ NoOfTableRow.size());
	//How to find no of columns in a table
		List<WebElement> columns = driver.findElements(By.xpath("//table//thead//td"));
		//int TotalNoOfColumns = columns.size();
		System.out.println("Total No of Columns "+columns.size());
	//How to read Header in a table
		for(WebElement header:columns)
		{
			System.out.print(header.getText()+" ");
		}
		System.out.println("=====================================");
	//How to Read all rows from table
		List<WebElement> allrowsData = driver.findElements(By.xpath("//table//tr"));
		Iterator<WebElement> it = allrowsData.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
	}

}

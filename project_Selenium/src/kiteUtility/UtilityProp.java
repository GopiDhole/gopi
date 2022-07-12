package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp 
{
 //excel
	//screenshot
	//closing
	
	public static String getDataFromPropertyFile(String key) throws IOException 
	{
		Properties prop=new Properties();//created object of properties
		FileInputStream myfile=new FileInputStream("C:\\Users\\Acer\\eclipse-workspace\\project_Selenium\\myproperties.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
		
		
	}
}

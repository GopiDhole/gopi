package excelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\GOPI SOFTWARE TESTING\\ExcelSheet1.xlsx");
	//How to read String Value
		String name = WorkbookFactory.create(myfile).getSheet("Data").getRow(1).getCell(0).getStringCellValue();
		System.out.println(name);
		
//		double number = WorkbookFactory.create(myfile).getSheet("Data").getRow(4).getCell(0).getNumericCellValue();
//		System.out.println(number);
		
	//how to read numeric value
		double number = WorkbookFactory.create(myfile).getSheet("Data").getRow(3).getCell(0).getNumericCellValue();
		System.out.println(number);
		
	//how to read char value
		String ABCD = WorkbookFactory.create(myfile).getSheet("Data").getRow(2).getCell(0).getStringCellValue();
		System.out.println(ABCD);
		
	//how to read boolean value
		boolean myValue = WorkbookFactory.create(myfile).getSheet("Data").getRow(5).getCell(0).getBooleanCellValue();
		System.out.println(myValue);
	}

}

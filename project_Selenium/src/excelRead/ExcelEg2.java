package excelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\GOPI SOFTWARE TESTING\\ExcelSheet1.xlsx");
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mySheet = book.getSheet("Data");
		Row myRow = mySheet.getRow(5);
		Cell myCell = myRow.getCell(1);
		System.out.println(myCell.getCellType());
		
	//code for reading whole data from excel sheet
		Sheet myData2 = book.getSheet("Data2");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=3;j++)
			{
				String value = myData2.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
	}

}

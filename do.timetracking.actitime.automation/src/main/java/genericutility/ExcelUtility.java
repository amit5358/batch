package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String fetchDataFromExcelSheet(String sheetName,int rowNo, int cellNo) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/excelData.xlsx");
		
		Workbook workBook = WorkbookFactory.create(fis);
		
		return workBook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
		
	}

}

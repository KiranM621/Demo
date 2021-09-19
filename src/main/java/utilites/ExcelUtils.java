package utilites;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook book = null;
	static XSSFSheet sheet  = null;
	
	 public ExcelUtils(String excelPath,String sheetName) { 
		
		 try {
				book = new XSSFWorkbook(excelPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
			// get sheet from excel workbook
			sheet = book.getSheet(sheetName);
		 
		 
	 }
	
	

	public int getRowCount() { 
		//creating instance for excel worksheet
	
		
		
		
		int row_count  = sheet.getPhysicalNumberOfRows();
		
	    return row_count;

		
		
		
	}
	

	public int getColumnCount() { 
		//creating instance for excel worksheet
	
		
		
		
		int col_count  = sheet.getRow(0).getPhysicalNumberOfCells();
		

	    return col_count;

	}
	
	public String getStringCellValue(int row,int col) { 
		DataFormatter formatter = new DataFormatter();
		String val = formatter.formatCellValue(sheet.getRow(row).getCell(col));
		return val;

	}
	
	public int getNumericCellValue(int row,int col) { 
		
		int  val = (int)sheet.getRow(row).getCell(col).getNumericCellValue();

		return val;
	}
	
	
	
	

	
}

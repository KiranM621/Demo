package utilites;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	
	@Test(dataProvider="testData")
	public void test(String name,String number,String email,String password,String confirmPassword) { 
		
		System.out.println(name+"|"+number+"|"+email+"|"+password+"|"+confirmPassword);
		
	}
	
	@DataProvider(name="testData")
	public Object[][] getData() { 
		
		
		Object data[][] = testData("excel/Data.xlsx","Signup");
		return data;
		
	}
	
	
	
	
	public static Object[][] testData(String path,String sheet) { 
		
		ExcelUtils excel = new ExcelUtils(path,sheet);
		int row_Count = excel.getRowCount();
		int col_Count = excel.getColumnCount();

		
		Object data[][] = new Object[row_Count - 1][col_Count];
		
		for(int i = 1 ; i < row_Count ; i++) { 
			
			
			for(int j = 0 ; j < col_Count ; j++) { 
				
/*	if(j==1) { 
					int cellData = excel.getNumericCellValue(i, j);
					data[i-1][j] = cellData;

					//System.out.println(cellData);
					continue;
					
				}*/
				String cellData = excel.getStringCellValue(i, j);
				//System.out.println(cellData);
				data[i-1][j] = cellData;
				
			}
			
		}
		
		return data;
		 
		
	}
}

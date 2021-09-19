package utilites;

public class ExcelDemo {

	public static void main(String[] args) { 
		
		ExcelUtils obj = new ExcelUtils("excel/Data.xlsx","Signup");
		obj.getRowCount();
		obj.getStringCellValue(1,0);
		//obj.getNumericCellValue(1,1);
	}

}

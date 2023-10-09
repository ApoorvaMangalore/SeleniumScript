package workingWithExternalDatas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static void main(String[] args) throws IOException {
		File file = new File("./testData/TestData.xlsx");

		// To handel the file input stream.(to give path)
		FileInputStream fis = new FileInputStream(file);
		
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
	
		
		XSSFSheet dataSheet = workbook.getSheet("data");
		
		XSSFSheet sheet = workbook.getSheet("data");
		int row = sheet.getLastRowNum();
		System.out.println(row);
		
	}
}

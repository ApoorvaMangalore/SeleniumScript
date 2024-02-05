package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");

		// Step 2 : Creating object of File type
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Step 3 : Read methods
		String value = workbook.getSheet("data").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		System.out.println(workbook.getSheet("data").getRow(0).getCell(1).getStringCellValue());
		System.out.println(workbook.getSheet("data").getRow(1).getCell(0).getStringCellValue());
		System.out.println(workbook.getSheet("data").getRow(1).getCell(1).getStringCellValue());
		System.out.println(workbook.getSheet("data").getRow(2).getCell(0).getStringCellValue());
		System.out.println(workbook.getSheet("data").getRow(2).getCell(1).getStringCellValue());
		

		LocalDateTime date = workbook.getSheet("data").getRow(3).getCell(1).getLocalDateTimeCellValue();
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfMonth());

	}
}

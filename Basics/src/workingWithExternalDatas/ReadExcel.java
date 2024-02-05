package workingWithExternalDatas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {

		File file = new File("./testData/TestData.xlsx");

		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		//XSSFWorkbook xsf = new XSSFWorkbook(fis);// .xlsx

		// HSSFWorkbook hssf = new HSSFWorkbook(fis);// .xls

		String sheetName = workbook.getSheetName(0);
		System.out.println(sheetName);

		 Sheet sheet = workbook.getSheet(sheetName);
		String entry1 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(entry1);
		String entry2 = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(entry2);

		workbook.close();

	}
}

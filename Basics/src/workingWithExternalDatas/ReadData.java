
package workingWithExternalDatas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.streaming.DeferredSXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// To handel file
		File file = new File("./testData/TestData.xlsx");

		// To handel the file input stream.(to give path)
		FileInputStream fis = new FileInputStream(file);

		// create object for xssfworkbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Get sheet from entire workbook
		XSSFSheet sheet = workbook.getSheet("data");

		int rowCount = sheet.getLastRowNum();// getrow
		int clmCount = sheet.getRow(0).getLastCellNum();

		System.out.println(rowCount);
		System.out.println(clmCount);

		String row0 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(row0);

		Object[][] data = new Object[rowCount][clmCount];
		for (int r = 0; r < rowCount; r++) {
			XSSFRow row = sheet.getRow(r + 1);

			for (int c = 0; c < clmCount; c++) {
				XSSFCell cell = row.getCell(c);

				//System.out.println(row);
				System.out.println(cell);

			}
		}
	}
}

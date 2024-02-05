
package workingWithExternalDatas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
		int cellcount = sheet.getRow(0).getLastCellNum();

		//System.out.println(rowCount);
		//System.out.println(cellcount);

		int numrows = workbook.getSheet("data").getPhysicalNumberOfRows();
		int numofcells = workbook.getSheet("data").getRow(0).getPhysicalNumberOfCells();
		System.out.println(numrows);
		System.out.println(numofcells);
		
		Workbook book=WorkbookFactory.create(fis);
		System.out.println(book.getSheet("data").getPhysicalNumberOfRows());
		System.out.println(book.getSheet("data").getRow(0).getPhysicalNumberOfCells());

	}

}

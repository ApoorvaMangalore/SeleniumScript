package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("data");
		int rownum = sheet.getPhysicalNumberOfRows();
		int colNum = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] data = new String[rownum - 1][colNum];
		for (int i = 0; i < rownum - 1; i++) {
			for (int j = 0; j < colNum; j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
				System.out.print(data[i][j] + "   ");
			}
			System.out.println();
		}
	}
}

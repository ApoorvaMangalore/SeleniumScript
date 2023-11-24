package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basic {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		Workbook ref = WorkbookFactory.create(fis);
		int rows = ref.getSheet("data").getPhysicalNumberOfRows();
		int clm = ref.getSheet("data").getRow(0).getPhysicalNumberOfCells();
		System.out.println(rows);
		System.out.println(clm);
		String[][] data1 = new String[rows][clm];
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < clm; j++) {
				data1[i][j] = ref.getSheet("login").getRow(1).getCell(1).toString();
				System.out.print(data1[i][j]  + "  ");
			}
			System.out.println();
		}
		
	}
}

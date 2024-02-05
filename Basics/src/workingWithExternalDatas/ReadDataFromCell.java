package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		Workbook ref = WorkbookFactory.create(fis);
		int rows = ref.getSheet("login").getPhysicalNumberOfRows();
		int clm = ref.getSheet("login").getRow(0).getPhysicalNumberOfCells();
		System.out.println(rows);
		System.out.println(clm);
		String[][] data1 = new String[rows][clm];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < clm; j++) {
				data1[i][j] = ref.getSheet("login").getRow(i).getCell(j).toString();
				System.out.print(data1[i][j]  + "  ");
			}
			System.out.println();
		}
		
	}
}

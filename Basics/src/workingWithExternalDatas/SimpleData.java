package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SimpleData {

	
	public String readStringData(int row,int col) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testData/data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = (Sheet) workbook.getSheet("Sheet1");
		return ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(row).getCell(col).toString();
		
	}
}

package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		int numRows = workbook.getSheet("regdata").getPhysicalNumberOfRows();
		int numCells = workbook.getSheet("regdata").getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[numRows][numCells];

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCells; j++) {
				data[i][j] = workbook.getSheet("regdata").getRow(i).getCell(j).toString();
			}
		}
		String female = "female";
		String male = "male";

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		if (female.equalsIgnoreCase("female")) {
			driver.findElement(By.id("gender-female")).click();
		} else {
			driver.findElement(By.id("gender-male")).click();
		}

		driver.findElement(By.id("FirstName")).sendKeys(data[1]);
		driver.findElement(By.id("LastName")).sendKeys(data[2]);
		driver.findElement(By.id("Email")).sendKeys(data[3]);
		driver.findElement(By.id("Password")).sendKeys(data[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data[5]);
		driver.findElement(By.id("register-button")).submit();
	}
}

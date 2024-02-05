package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopLogin {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");

		// Step 2 : Creating object of File type
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		driver.findElement(By.id("Email"))
				.sendKeys(workbook.getSheet("demoweb").getRow(0).getCell(0).getStringCellValue());
		driver.findElement(By.id("Password"))
				.sendKeys(workbook.getSheet("demoweb").getRow(0).getCell(1).getStringCellValue());

	}

}

package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterForDemo {
	//give parallel
	@DataProvider()
	public String[][] registerData()  throws Exception, IOException {
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		Workbook ref = WorkbookFactory.create(fis);
		int numOfRows = ref.getSheet("regdata").getPhysicalNumberOfRows();
		int numOfCells = ref.getSheet("regdata").getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[numOfRows][numOfCells];
		
		for(int i=0; i<numOfRows; i++) {
			for(int j=0; j<numOfCells; j++) {
				data[i][j] = ref.getSheet("regdata").getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	
	@Test(dataProvider = "registerData")
	public void registerUser(String [] dataToReg) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		if(dataToReg[0].equalsIgnoreCase("male")){
			driver.findElement(By.id("gender-male")).click();
		}else {
			driver.findElement(By.id("gender-female")).click();
		}		
		driver.findElement(By.id("FirstName")).sendKeys(dataToReg[1]);
		driver.findElement(By.id("LastName")).sendKeys(dataToReg[2]);
		driver.findElement(By.id("Email")).sendKeys(dataToReg[3]);
		driver.findElement(By.id("Password")).sendKeys(dataToReg[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(dataToReg[5]);
		driver.findElement(By.id("register-button")).click();	
		driver.close();
	}
}


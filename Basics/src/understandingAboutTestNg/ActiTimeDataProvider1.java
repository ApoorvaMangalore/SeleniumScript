package understandingAboutTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataProvider1 {

	@Test(dataProvider = "data")
	public void openBrowser(String[] login) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		driver.findElement(By.name("username")).sendKeys(login[0]);
		driver.findElement(By.name("pwd")).sendKeys(login[1]);
		driver.findElement(By.name("remember")).click();
		Reporter.log("pass");
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
	}

	@DataProvider(name = "data")
	public String[][] dataSet() {
		String[][] data1 = { { "apoorva", "acm" }, { "acm", "apoorva" }, };
		return data1;

	}
}

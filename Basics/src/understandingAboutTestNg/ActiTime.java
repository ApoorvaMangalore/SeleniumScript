package understandingAboutTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTime {
	@Test(dataProvider = "data")
	public void openBrowser(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://timetracker.ctepl.com/actitime/login.do");

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.name("remember")).click();
		Reporter.log("pass");
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
	}

	@DataProvider(name = "data")
	public Object[][] dataSet() {
		return new Object[][] { { "apoorva", "acm" }, { "acm", "apoorva" }, };

	}
}

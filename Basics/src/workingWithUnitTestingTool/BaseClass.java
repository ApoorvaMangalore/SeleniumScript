package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;// make it static

	String emailId = "apoorva.c@testyantra.com";
	String password = "su8WX*xH7YfC2";

//browser set up
	@BeforeClass
	public void browsersetup() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}

//login script
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(emailId);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

//logout script
	@BeforeMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
	}

//quit browser
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

//To make connection for database(JDBC)java data base connection or report
	@BeforeSuite
	public void dataBaseStart() {
		Reporter.log("Data base coonection is started", true);
		Reporter.log("Report genration started", true);
	}

//To close connection for database(JDBC)java data base connection or repot
	@AfterSuite
	public void dataBaseClose() {
		Reporter.log("Data base coonection is stoped", true);
		Reporter.log("Report genration stoped", true);
	}
}

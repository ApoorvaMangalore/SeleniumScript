package workingWithUnitTestingTool;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ToUnderstandTheExcecutionOrder {

	@Test
	public void createAccount() {
		Reporter.log("Account is creatated", true);
	}

	@BeforeClass
	public void openBrowser() {
		Reporter.log("Browser is opened", true);
	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("Browser is closed", true);
	}

	@BeforeMethod
	public void loginApp() {
		Reporter.log("logged in with valid data", true);
	}

	@AfterMethod
	public void logoutApp() {
		Reporter.log("logged out from app", true);
	}

	@Test
	public void acountModify() {
		Reporter.log("Acount is modified", true);
	}

	@Test
	public void deleteAccount() {
		Reporter.log("Acount is modified", true);
	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Data base coonection in started");
	}

	@BeforeSuite
	public void afterSuite() {
		Reporter.log("Data base coonection in stoped");
	}
}

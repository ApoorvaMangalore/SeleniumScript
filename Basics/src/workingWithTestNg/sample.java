package workingWithTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import understandingAboutTestNg.DependsOnMethod;

public class sample {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("data base connection is started");
		System.out.println("report formtion start");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("to open the browser");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("to quit the browser");
	}

	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("data base connection is Stoped");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("i am before  menthod");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println(" iam before test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println(" i am after test");
	}
}

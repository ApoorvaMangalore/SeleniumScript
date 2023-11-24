package workingWithUnitTestingTool;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample {
	@Test
	public void login1() {
		System.out.println("I am  test ");
	}

	@Test
	public void login() {
		System.out.println("I am  test2 ");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Data base connection");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("close the DB");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("i am after test");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("i am before test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("i am before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("i am after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("i am before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("i am after method");
	}
}

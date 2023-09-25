package understandingAboutTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {

	@Test(dependsOnMethods = "register")
	public void homePage() {
		System.out.println("Home Page is displayed");
	}

	@Test(description =  "User reg")
	public void register() {
		System.out.println("Register page is displayed");
	}

	
	@Test(invocationCount = 3)
	public void login() {
		Reporter.log("helllo login");
	}

	@Test
	public void cart() {
		System.out.println("Cart page is displayed");
	}

	@Test
	public void payment() {
		System.out.println("Payement is done");
	}

	@Test()
	public void msg() {
		System.out.println("Msg is sent");
	}

}

package understandingAboutTestNg;

import org.testng.annotations.Test;

import workingWithFindElements.demoHtmlPage;

public class DependsOnMethod {

	@Test
	public void login() {
		System.out.println("Login successful");
	}

	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("Search successful");
	}

	@Test(dependsOnMethods = "search")
	public void advanceSearch() {
		System.out.println("Advanced Search successful");
	}

	@Test(dependsOnMethods = "advanceSearch")
	public void logout() {
		System.out.println("Logout successful");
	}

}

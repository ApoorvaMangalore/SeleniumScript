package understandingAboutTestNg;

import org.testng.annotations.Test;

import workingWithFindElements.demoHtmlPage;

public class DependsOnMethod {

	@Test
	public void login() {
		System.out.println("Login successful");
	}

	@Test()
	public void search() {
		System.out.println("Search successful");
	}

	@Test()
	public void advanceSearch() {
		System.out.println("Advanced Search successful");
	}

	@Test()
	public void logout() {
		System.out.println("Logout successful");
	}

}

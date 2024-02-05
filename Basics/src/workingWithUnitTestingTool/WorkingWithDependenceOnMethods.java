package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithDependenceOnMethods {

	@Test()
	public void register() {
		System.out.println("Register");
	}

	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("Login");
	}

	@Test(dependsOnMethods = "buy")
	public void logout() {
		System.out.println("Logout");
	}

	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("Search");
	}

	@Test(dependsOnMethods = "search")
	public void cart() {
		System.out.println("Cart");
	}

	@Test(dependsOnMethods = "cart")
	public void wishlist() {
		System.out.println("WishList");
	}

	@Test(dependsOnMethods = "wishlist")
	public void buy() {
		System.out.println("Buy");
	}
}

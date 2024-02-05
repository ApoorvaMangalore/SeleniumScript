package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithPriorityattribute {
	//defaul value is zero
	final int a = 4;

	@Test(priority = a)
	public void registration() {
		System.out.println("i am registration");
	}

	@Test(priority = -2)
	public void login() {
		System.out.println("i am login");
	}

	@Test(priority = 3)
	public void addProd() {
		System.out.println("i amaddProd");
	}

	@Test(priority = 4)
	public void logout() {
		System.out.println("i amlogout");
	}
}

package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithDependendsOnGroup {

	@Test(dependsOnGroups = "one")
	public void goodnight() {
		System.out.println("Good night");
	}

	@Test(groups = "one")
	public void hello() {
		System.out.println("Hello");
	}

	@Test(groups = "one")
	public void gm() {
		System.out.println("Good morning");
	}
	
	@Test(groups = "two")
	public void dinner() {
		System.out.println("Dinner");
	}

	

	

}

package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithPriorityattribute {
	//defaul value is zero
	final int a = 4;

	@Test(priority = a)
	public void fail() {
		System.out.println("i am fail");
	}

	@Test(priority = 0)
	public void testcase() {
		System.out.println("i am testcase");
	}

	@Test(priority = -1)
	public void run() {
		System.out.println("i am run");
	}

	@Test(priority = 4)
	public void pass() {
		System.out.println("i am pass");
	}
}

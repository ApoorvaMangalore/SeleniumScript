package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithEnable {

	// default value is true
	@Test(enabled = false)
	public void testcase() {
		System.out.println("testcase");
	}

	@Test()
	public void run() {
		System.out.println("run");
	}
}

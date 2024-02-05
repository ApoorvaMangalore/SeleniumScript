package workingWithUnitTestingTool;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class WorkingWithEnable {

	// default value is true
	@Test(enabled = true)
	public void testcase() {
		System.out.println("testcase");
	}
	@Ignore
	@Test()
	public void run() {
		System.out.println("run");
	}
}

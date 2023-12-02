package workingWithExtentReports;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Simple {
	@Test
	public void Test_case_1() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		// Path to store our extent report and format .html
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./extentreport/Today1.html");
		ExtentReports report = new ExtentReports();
		// To attach the report
		report.attachReporter(sparkReporter);
		// To specify the name of Test Case
		ExtentTest test = report.createTest("Test_case_1");
		// Logging Information status
		test.log(Status.INFO, "Login Page Displayed");
		// Logging Pass status
		test.log(Status.PASS, "Login Test Case Pass");
		// To attach the screenshot
		test.addScreenCaptureFromPath("Path of the screen shot", "Login Page Displayed");
		// To end test compulsory method flush.
		report.flush();
	}
}

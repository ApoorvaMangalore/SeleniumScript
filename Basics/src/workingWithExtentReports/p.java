package workingWithExtentReports;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class p {
@Test()
public void extentreport() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
		ExtentSparkReporter esr=new ExtentSparkReporter("./extentreport/meesho.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(esr);
		ExtentTest test = reports.createTest("extentreport");
		test.log(Status.INFO, "app is opened");
		test.addScreenCaptureFromPath("./errorShots/aaa", "app is opened");
		reports.flush();
	}
}

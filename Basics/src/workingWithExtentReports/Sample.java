/*
 * package workingWithExtentReports;
 * 
 * import java.io.ObjectInputFilter.Status;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * import com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.reporter.ExtentSparkReporter;
 * 
 * public class Sample { public static void main(String[] args) {
 * 
 * ExtentSparkReporter exp = new
 * ExtentSparkReporter("./extentreport/extentreport2.html");
 * 
 * // create extentreport and attach report(s) ExtentReports extentReport = new
 * ExtentReports(); extentReport.attachReporter(exp);
 * 
 * // create a toggle for the given test,adds all log events ExtentTest test =
 * extentReport.createTest("open demo webshop", "this is test to validate");
 * 
 * System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
 * WebDriver driver = new FirefoxDriver(); driver.manage().window().maximize();
 * 
 * driver.get("http://demowebshop.tricentis.com/"); ExtentTest test;
 * //test.log(Status. "application lunched");
 * test.pass("naviagated to the demoweb");
 * 
 * driver.findElement(By.linkText("Register")).click(); WebElement radioButton =
 * driver.findElement(By.id("gender-female")); radioButton.click();
 * 
 * test.fail("test case is fail"); extentReport.flush();
 * 
 * } }
 */
package understandingAboutTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestCase_003 {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test(groups = "smoke")
	public void bmtc(@Optional("chrome") String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Empty browser has launched");
			driver.manage().window().maximize();
		}else if(bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Empty browser has launched");
			driver.manage().window().maximize();
		}
		
		driver.get("https://mybmtc.karnataka.gov.in/english");
		//driver.quit();
	}
}

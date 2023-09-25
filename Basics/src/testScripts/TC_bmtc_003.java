package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_bmtc_003 {

	@Test(groups ="govt")
	public void bmtc() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");
		driver.manage().window().maximize();
		driver.get("https://mybmtc.karnataka.gov.in/english");
		System.out.println("Bmtc is opened");
		driver.quit();
	}
}

package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_wcs_010 {
	@Test
	public void wcs() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");
		driver.manage().window().maximize();
		driver.get("https://india.wcs.org/");
		System.out.println("Wcs is opened");
		driver.quit();
	}
}

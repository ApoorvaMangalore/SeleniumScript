package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_kitkat_006 {
	@Test(groups = "chocklet")
	public void kitkat() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");
		driver.manage().window().maximize();

		driver.get("https://www.nestle.com/brands/chocolate-confectionery/kitkat");
		System.out.println("Kit kat is opened");
		driver.quit();
	}
}

package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_testyantra_008 {
	@Test(groups = "govt")
	public void adhar() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");
		driver.manage().window().maximize();
		driver.get("https://www.testyantra.com/");
		System.out.println("Test yantra is opened");
		driver.quit();
	}
}

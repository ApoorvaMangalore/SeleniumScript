package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_qsp_009 {
	@Test(groups = "app")
	public void qsp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		System.out.println("Qspider is opened");
		driver.quit();
	}
}

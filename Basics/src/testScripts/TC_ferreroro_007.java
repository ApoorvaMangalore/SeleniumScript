package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_ferreroro_007 {
	@Test(groups = "chocklet")
	public void adhar() {
		System.setProperty("webdriver.chrome.drive", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");
		driver.manage().window().maximize();
		driver.get("https://www.ferrerorocher.com/us/en/");
		System.out.println("Ferreroro is opened");
		driver.quit();
	}
}

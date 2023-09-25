package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_cadbury_005 {
	
	//you can add for 2 groups
	@Test(groups = "chocklet")
	public void cadbury() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");
		driver.manage().window().maximize();

		driver.get("https://cadburygifting.in/");
		System.out.println("Cadbury is opened");
		driver.quit();
	}
}

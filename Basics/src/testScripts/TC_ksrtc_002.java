package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_ksrtc_002 {

	@Test(groups = "govt")
	public void ksrtc() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");
		driver.manage().window().maximize();
		driver.get("https://www.ksrtc.in/oprs-web/");
		System.out.println("Ksrtc is opened");
		driver.quit();
	}
}

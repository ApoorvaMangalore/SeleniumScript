package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_demoweb_004 {

	@Test(groups = "govt")
	public void demoweb() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Demoweb shop is opened");
		driver.quit();
	}
}

package understandingAboutTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_004 {

	@Test(groups = "system")
	public void demoweb() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		//driver.quit();
	}
}

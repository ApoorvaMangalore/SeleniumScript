package launchEmptyBrowser;

import org.openqa.selenium.opera.OperaDriver;

public class LunchOperaBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		OperaDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
	}
}

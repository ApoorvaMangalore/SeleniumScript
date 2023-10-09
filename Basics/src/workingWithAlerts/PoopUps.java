package workingWithAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PoopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://expired.badssl.com/");

		 //driver.quit();
	}

}

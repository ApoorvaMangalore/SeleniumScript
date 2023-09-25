package workingWithOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeTheBrowser {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://omayo.blogspot.com/");
	}

}

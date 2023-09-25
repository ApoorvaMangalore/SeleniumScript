package workingWithWebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class TogetUrlAndPageSourceMeesho {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.meesho.com/");

		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
}

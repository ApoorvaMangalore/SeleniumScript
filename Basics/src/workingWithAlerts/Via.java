package workingWithAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Via {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		System.out.println("Browser has maximized");

		// To luanch the via.com
		driver.get("https://in.via.com");
		System.out.println("Application has launched");
		Thread.sleep(2000);

		WebElement signIn = driver.findElement(By.xpath("//div[contains(text(),'Sign In')]"));
		signIn.click();
		System.out.println("User is able to click on Sign-In Button");

		// To click on signUp button
		driver.findElement(By.xpath("//span[contains(text(),'SIGN UP')]")).click();
		System.out.println("User is able to click on Sign-Up Button");

	}

}

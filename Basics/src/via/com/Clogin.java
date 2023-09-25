package via.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Clogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		System.out.println("Browser has maximized");

		// To luanch the via.com
		driver.get("https://in.via.com");
		System.out.println("Application has launched");
		Thread.sleep(2000);
		WebElement signIn = driver.findElement(By.xpath("//div[contains(text(),'Sign In')]"));
		signIn.click();

		driver.findElement(By.xpath("//a[text()='Corporate Login']")).click();
		Thread.sleep(5000);
		Set<String> allwindow = driver.getWindowHandles();

		for (String window : allwindow)
			driver.switchTo().window(window);
		String title;
		System.out.println(title = driver.getTitle());
		if (title.contains("Login Corporate")) {

			driver.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("apoorva@gmail.com");

			driver.quit();
		}
	}
}

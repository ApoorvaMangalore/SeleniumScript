package workingWithAlerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandelAllPopupNotification {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		driver.findElement(By.id("dest")).sendKeys("Mangalore");
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		

	}

}

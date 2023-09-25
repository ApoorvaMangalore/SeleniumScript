package workingWithAlerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAlertInGuru99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234567890");
		driver.findElement(By.name("submit")).click();

		Alert alert = driver.switchTo().alert();
		// alert.dismiss();
		alert.accept();
		Thread.sleep(3000);

		// Alert alert1 = driver.switchTo().alert();

		alert.accept();
		driver.quit();

	}
}

package workingWithAlerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingupPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://www.browserstack.com/users/sign_up");
		driver.findElement(By.id("accept-cookie-notification")).click();

		driver.findElement(By.name("user[full_name]")).sendKeys("apoorva");
		driver.findElement(By.name("user[email]")).sendKeys("apoorva.c@testyantra.com");
		driver.findElement(By.name("user[password]")).sendKeys("asdfghjj1234");
		driver.findElement(By.name("commit")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Close']")).click();

	}

}

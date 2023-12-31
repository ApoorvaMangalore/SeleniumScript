package workingWithWebdriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomayoDemopage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();

		driver.findElement(By.linkText("Facebook")).click();

	}
}

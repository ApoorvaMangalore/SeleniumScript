package skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");

		driver.findElement(By.linkText("DevOps")).click();
		driver.findElement(By.linkText("Selenium Training")).click();
		driver.findElement(By.linkText("Java")).click();
		driver.findElement(By.linkText("C")).click();
		driver.findElement(By.linkText("dev")).click();
		driver.quit();

	}
}

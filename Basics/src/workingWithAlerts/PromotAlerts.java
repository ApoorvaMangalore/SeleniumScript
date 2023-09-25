package workingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PromotAlerts {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement prompt = driver.findElement(By.id("prompt"));
		prompt.click();
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("apoorva");
		
	}
}

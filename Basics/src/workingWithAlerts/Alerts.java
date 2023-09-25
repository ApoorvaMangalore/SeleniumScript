package workingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement alert1 = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		alert1.click();
		
		driver.switchTo().alert().accept();
		WebElement jspromt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("apoorva");
		alert.accept();
		driver.quit();
	}

}

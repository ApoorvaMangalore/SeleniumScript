package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partialinktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.partialLinkText("Books")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Computers")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	}

}

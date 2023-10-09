package workingWithActionsClass;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Meshoo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);

		driver.get("https://www.meesho.com/");
		//action.sendKeys(Keys.END).perform();
		//action.sendKeys(Keys.PAGE_UP).perform();
		//driver.findElement(By.linkText("Gold Jewellery Men")).click();
		driver.findElement(By.linkText("Leather Watches Men")).click();
	}
	
}

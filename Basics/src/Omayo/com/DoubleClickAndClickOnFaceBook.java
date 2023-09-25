package Omayo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndClickOnFaceBook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Actions actions=new Actions(driver);
		
		WebElement doubleClick = driver.findElement(By.id("testdoubleclick"));
		actions.doubleClick(doubleClick).perform();
		Thread.sleep(2000);
		WebElement facebook = driver.findElement(By.linkText("Flipkart"));
		facebook.click();
		Thread.sleep(2000);
		driver.quit();
	}
}

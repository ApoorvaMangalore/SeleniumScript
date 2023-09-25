package Omayo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		WebElement doubleclick = driver.findElement(By.xpath(" //button[contains(text(),'Double click Here')]"));
		actions.doubleClick(doubleclick).perform();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		driver.quit();
	}

}

package workingWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectall {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/");

		WebElement selector = driver.findElement(By.id("cars"));
		Select sel = new Select(selector);

		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);

		sel.deselectByIndex(2);
		Thread.sleep(2000);

		sel.deselectAll();

		driver.quit();
	}

}

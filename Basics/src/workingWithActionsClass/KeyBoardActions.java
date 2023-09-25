package workingWithActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

		driver.get("https://demowebshop.tricentis.com/");

		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.SPACE).perform();
	}

}

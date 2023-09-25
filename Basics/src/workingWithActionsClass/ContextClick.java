package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);

		driver.get("https://www.meesho.com/");
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		action.contextClick().perform();
		Thread.sleep(2000);

		action.contextClick(men).build().perform();//
		Thread.sleep(3000);
		driver.quit();

	}
}

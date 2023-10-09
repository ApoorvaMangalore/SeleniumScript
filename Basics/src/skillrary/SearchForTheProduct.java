package skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchForTheProduct {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.findElement(By.name("keyword")).sendKeys("java");
		Actions actions=new Actions(driver);
		Thread.sleep(6000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(6000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
	}
}

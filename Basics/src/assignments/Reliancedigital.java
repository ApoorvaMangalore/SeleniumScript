package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Reliancedigital {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);

		driver.get("https://www.reliancedigital.in/");

		driver.findElement(By.id("RIL_FindAStore")).click();

		driver.findElement(By.xpath("//a[text()='Buying guides']")).click();

		driver.findElement(By.linkText("Contact us")).click();
		driver.findElement(By.id("RIL_HeaderCart")).click();

	}
}

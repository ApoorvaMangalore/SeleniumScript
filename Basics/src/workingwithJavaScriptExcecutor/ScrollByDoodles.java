package workingwithJavaScriptExcecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByDoodles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// driver.findElement(By.xpath("(//li[@class='doodle-thumb
		// hide-card'])[4]")).click();

		for (;;) {
			try {
				driver.findElement(By.linkText("Celebrating Pani Puri")).click();
				break;
			} catch (Exception e) {
				jse.executeScript("window.scrollBy(0, 250)");
			}
		}

	}
}

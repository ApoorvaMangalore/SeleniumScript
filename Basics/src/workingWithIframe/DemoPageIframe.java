package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPageIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		driver.switchTo().frame(0);

		driver.findElement(By.id("b-query")).sendKeys("apoorva");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("ta1")).sendKeys("mangalore");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("b-getorpost")).click();
		driver.navigate().back();

	}

}

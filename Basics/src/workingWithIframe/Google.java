package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
